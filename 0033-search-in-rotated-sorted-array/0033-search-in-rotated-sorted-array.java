class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(nums==null || n==0)return -1;
        int s=0,e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target)return mid;
             if(nums[s]<=nums[mid]){
                 if(target>=nums[s] && target<=nums[mid])e=mid-1;
                 else s=mid+1;
             }else{
                  if(target>=nums[mid] && target<=nums[e])s=mid+1;
                 else e=mid-1;
             }
        }
        return -1;
    }
}