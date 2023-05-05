class Solution {
    boolean isPalindrome(String s, int start, int end){
        while(start<=end ){
            if(s.charAt(start++)!= s.charAt(end--))return false;
           
        }
         return true;
    }
    void helper(int idx, String s,List<String>subString, List<List<String>> ans ){
        if(idx==s.length()){
           ans.add(new ArrayList(subString));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                subString.add(s.substring(idx,i+1));
                helper(i+1,s,subString, ans);
                subString.remove(subString.size()-1);
            }
        }
        
        
        
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList();
        List<String> subString=new ArrayList();
        helper(0,s,subString,ans);
        return ans;
    }
}