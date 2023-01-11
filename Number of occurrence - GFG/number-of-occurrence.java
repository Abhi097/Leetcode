//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int search(int []nums,int target,boolean first){
        int s=0,e=nums.length-1,ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target)s=mid+1;
            else if(nums[mid]>target)e=mid-1;
            else{
               ans=mid;
               if(first){
                  e=mid-1; 
               }else{
                  s=mid+1; 
               }
            }
        }
        return ans;

    }
    int count(int[] nums, int n, int target) {
        // code here
         int start=search(nums,target,true);
        int end=search(nums,target,false);
        if(start== -1 && end== -1)return 0;
        return end-start+1;
    }
}