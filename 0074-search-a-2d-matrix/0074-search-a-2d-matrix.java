class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int lo=0;
        int hi=m*n-1;
        while(hi>=lo){
            int mid=lo+ (hi-lo)/2;
            if(matrix[mid/m][mid%m]==target)
                return true;
            else if(matrix[mid/m][mid%m]<target)
              lo=mid+1;
            else hi=mid-1;
        }
        return false;
    }
}