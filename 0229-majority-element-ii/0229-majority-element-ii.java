class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int num1=-1,num2=-1,c1=0,c2=0,n=nums.length; 
        for(int num:nums){
            if(num==num1)c1++;
            else if(num==num2)c2++;
            else if(c1==0){
                num1=num;
                c1=1;
            }
            else if(c2==0){
                num2=num;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
            
        }
        int count1=0,count2=0;
        List<Integer>res=new ArrayList<>();
        for(int num:nums){
            if(num==num1)count1++;
            else if(num==num2)count2++;
        }
        if(count1>n/3)res.add(num1);
        if(count2>n/3)res.add(num2);
        return res;
    }
}