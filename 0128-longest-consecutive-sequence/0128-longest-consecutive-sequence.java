class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:nums){
            if(!set.contains(num-1)){
             int currentSeq=1;
                int currentnum=num;
                while(set.contains(currentnum+1)){
                    currentSeq+=1;
                    currentnum+=1;
                }
                longest=Math.max(currentSeq,longest);
                
            }
        }
        return longest;
    }
}