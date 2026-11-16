class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            int low = 0;
            int high = grid[i].length;

            while(low < high){
                int mid = low + (high - low)/2;

                if(grid[i][mid]>=0){
                    low = mid + 1;
                }
                else{
                    high = mid;
                }
            }
            count+=grid[i].length - low;
        }
        return count;
    }
}