class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b) -> (a[0]-a[1]) - (b[0]-b[1]));
        int N = costs.length/2, count = 0;
        for(int i=0;i<costs.length;i++){
            if(i < N)
                count += costs[i][0];
            else
                count += costs[i][1];
        }
        return count;
    }
}