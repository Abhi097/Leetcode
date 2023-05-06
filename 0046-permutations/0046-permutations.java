class Solution {
    void helper(int []nums,List<Integer>ds,boolean []freq,List<List<Integer>> ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                ds.add(nums[i]);
                freq[i]=true;
                helper(nums,ds,freq,ans);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans=new ArrayList();
        List<Integer>ds=new ArrayList();
        boolean freq[]= new boolean[nums.length];
        helper(nums,ds,freq,ans);
        return ans;
    }
}