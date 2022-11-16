class Solution {
    public static void reverse(int arr[],int i,int j){
        int x=i;
        int y=j;
        while(x<y){
           int t=arr[x];
            arr[x]=arr[y];
            arr[y]=t;
            x++;
            y--;
        }
    }
    public void rotate(int[] nums, int k) {
        
       int n= nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
}
}