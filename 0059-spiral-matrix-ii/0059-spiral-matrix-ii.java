class Solution {
    public int[][] generateMatrix(int n) {
      
       int matrix[][]=new int[n][n];
        int row=matrix.length;
        int col=matrix[0].length;
        int nums=1;
        if(row==0)return matrix;
        int l=0,r=col-1,t=0,b=row-1,d=0;
        while(l<=r && t<=b){
            if(d==0){
              for(int i=l;i<=r;i++){
                  matrix[t][i]=nums++;
              }
              d=1; t++; 
            }else if(d==1){
                 for(int i=t;i<=b;i++){
                matrix[i][r]=nums++;
              }
              d=2;r--;  
            }else if(d==2){
                 for(int i=r;i>=l;i--){
                 matrix[b][i]=nums++;
              }
               d=3; b--; 
            }else if(d==3){
                   for(int i=b;i>=t;i--){
                  matrix[i][l]=nums++;
              }
              d=0; l++; 
            }
        }
        return matrix;
    }

}