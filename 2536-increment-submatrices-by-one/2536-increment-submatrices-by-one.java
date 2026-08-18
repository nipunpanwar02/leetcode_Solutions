class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff = new int[n+1][n+1];

        for(int i=0;i<queries.length;i++){
            int r1 = queries[i][0];
            int c1 = queries[i][1];
            int r2 = queries[i][2];
            int c2 = queries[i][3];
            //diff arr of 2d arr..//
            diff[r1][c1]++;
            diff[r1][c2+1]--;
            diff[r2+1][c1]--;
            diff[r2+1][c2+1]++;
        }
        //prefix sum of 2d arr..//
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                diff[i][j] += diff[i][j-1];
            }
        }
        for(int j=0;j<n;j++){
            for(int i=1;i<n;i++){
                diff[i][j] += diff[i-1][j];
            }
        }

        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = diff[i][j];
            }
        }
        return ans;
    }
}