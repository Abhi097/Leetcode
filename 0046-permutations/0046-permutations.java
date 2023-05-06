class Solution {
    void helper(int idx,int []nums,List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer>ds=new ArrayList();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList(ds));
            return;
        }
        for(int i=idx;i<nums.length;i++){
          swap(i,idx,nums);
            helper(idx+1, nums,ans);
            swap(i,idx,nums);
        }
    }
    void swap(int i,int j,int []nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans=new ArrayList();
        helper(0,nums,ans);
        return ans;
    }
}