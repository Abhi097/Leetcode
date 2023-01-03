class Solution {
    public int minDeletionSize(String[] strs) {
        if(strs==null || strs.length == 0)return 0;
        int column=strs[0].length();
        int ans=0;
        for(int i=0;i<column;i++){
        char current=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)<current){
                    ans++;
                    break;
                }
              current= strs[j].charAt(i);  
            }
        }
        return ans;
    }
}