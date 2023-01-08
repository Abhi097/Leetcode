class Solution {
    public int maxPoints(int[][] points) {
        // if slopes of 2 points are same then they are on  same line.
		// slope of 2 points = (y2-y1)/(x2-x1);
		
		Map<Double, Integer> slope = new HashMap<Double, Integer>();
		int ans = 0;
		for (int i = 0; i < points.length - 1; i++) {
			int countForIndividualCoordinte =0;
			double currSlope = 0;
			for (int j = i + 1; j < points.length; j++) {
				if (points[j][0] - points[i][0] == 0)
					currSlope = 100000001; // slope will become infinity
				else
					currSlope = (double) (points[j][1] - points[i][1])
							/(double) (points[j][0] - points[i][0]);
                    if(currSlope == -0d){
                        // if slope is zero, then -0 is same as 0
                        currSlope=Math.abs(currSlope);
                    }
				slope.put(currSlope, slope.getOrDefault(currSlope, 0) + 1);
				countForIndividualCoordinte = slope.get(currSlope)>countForIndividualCoordinte ? slope.get(currSlope): countForIndividualCoordinte;	
			}
			slope.clear();
		    ans= countForIndividualCoordinte > ans ? countForIndividualCoordinte:ans;
		}
		
		return ans+1;// add 1 to include the current point also for total count 
    }
}