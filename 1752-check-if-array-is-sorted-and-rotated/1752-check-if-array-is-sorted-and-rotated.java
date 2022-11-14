class Solution {
    public boolean check(int[] nums) {
      int check=0;
      int n= nums.length;

      for(int i=0;i<n;i++){
          if(nums[i]>nums[(i+1)%n])
          {
              check++;
          }
          if(check>1)
          return false;


      }  
      return true;
    }
}