class Solution {
    public void setZeroes(int[][] matrix) {
        int rows= matrix.length;
        int col=matrix[0].length;
        boolean fcol=false,frow=false;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    if(i==0)frow=true;
                    if(j==0)fcol=true;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
       if(frow) {
        for(int j = 0; j < col; j++) {
            matrix[0][j] = 0;
        }
    }
        if(fcol){
 for(int i=0;i<rows;i++){matrix[i][0]=0;}
        }
    }
}