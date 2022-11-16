class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
          int k=0;
       while(k<n){
           if(nums[k]==0){
               break;
           }else
           {
               k++;
           }
       }
       int i=k;
       int j=k+1;
       while(i<n && j<n){
           if(nums[j]!=0){
               int t=nums[i];
               nums[i]=nums[j];
               nums[j]=t;
               i++;
           }
           j++;
       }
    }
}