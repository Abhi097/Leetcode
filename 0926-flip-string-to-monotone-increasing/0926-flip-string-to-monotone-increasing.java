class Solution {
    public int minFlipsMonoIncr(String s) {
        int oneCount=0,ztoOne=0,i=0;
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        for(;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='0')ztoOne++;
            else oneCount++;
            
            if(ztoOne>oneCount)
                ztoOne=oneCount;
        }
        return ztoOne;
    }
}