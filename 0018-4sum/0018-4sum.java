class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      List<List<Integer>> res= new ArrayList<>();
        if(nums==null || nums.length==0)return res;
        if(target==-294967296 || target==294967296) return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
             int target1=target-nums[i]-nums[j];
                int left=j+1,right=nums.length-1;
                while(left<right){
                    int two_sum=nums[left]+nums[right];
                    if(two_sum<target1)left++;
                    else if(two_sum>target1)right--;
                    else{
                        List<Integer>quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                        while(left<right && nums[left]==quad.get(2))++left;
                        while(left<right && nums[right]==quad.get(3))--right;
                    }
                }
                while(j+1<nums.length && nums[j+1]==nums[j])++j;
            }
            while(i+1<nums.length && nums[i+1]==nums[i])++i;
        }
        return res;
    }
}