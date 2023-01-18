class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int total=0,cmax=0,cmin=0,maxSum=nums[0],minSum=nums[0];
        for(int i:nums){
            cmax= Math.max(cmax+i,i);
            maxSum=Math.max(maxSum,cmax);
             cmin= Math.min(cmin+i,i);
            minSum=Math.min(minSum,cmin);
            total+=i;
        }
        return maxSum>0 ? Math.max(maxSum,total-minSum) : maxSum;
    }
}