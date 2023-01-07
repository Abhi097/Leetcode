class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=cost.length;
        int total_gas=0;
        int current_gas=0;
        int index=0;
        for(int i=0;i<n;i++){
            total_gas+=gas[i]-cost[i];
            current_gas+=gas[i]-cost[i];
            if(current_gas<0){
                current_gas=0;
                index=i+1;
            }
            
        }
        return total_gas<0? -1 : index;
    }
}