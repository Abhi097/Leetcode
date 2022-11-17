class Solution {
    public int missingNumber(int[] nums) {
        int N=nums.length+1;
         int missNum=0;
         for(int i=0;i<N;i++ ){
             missNum=missNum^i;
         }
         for(int i=0;i<N-1;i++){
             missNum=missNum^nums[i];
         }
         return missNum;
    }
}