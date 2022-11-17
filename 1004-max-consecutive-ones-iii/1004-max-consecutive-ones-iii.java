class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,ans=0,zerocnt=0;
        while(j<nums.length){
            if(nums[j]==0){
                zerocnt++;
            }
            while(zerocnt>k){
                if(nums[i]==0)zerocnt--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}