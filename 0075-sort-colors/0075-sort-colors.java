class Solution {
    public void swap(int[] nums, int i, int j) {
	int temp = nums[i];
	nums[i] = nums[j];
	nums[j] = temp;
}
    public void sortColors(int[] nums) {
        int lo=0,hi=nums.length-1,mid=0;
        while(mid<=hi){
            if(nums[mid]==0){
                swap(nums,lo,mid);
                lo++;
                mid++;
                
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
               swap(nums,hi,mid);
                hi--;
              
            }
        }
    }
}