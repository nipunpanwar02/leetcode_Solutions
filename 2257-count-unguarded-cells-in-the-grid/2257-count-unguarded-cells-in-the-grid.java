class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int grid[][] = new int[m][n];

        for(int i=0;i<guards.length;i++){
            int row = guards[i][0];
            int column = guards[i][1];
            grid[row][column] = 1;
        }
        for(int i=0;i<walls.length;i++){
            int row = walls[i][0];
            int column = walls[i][1];
            grid[row][column] = 2;
        }

        for(int i=0;i<m;i++){
            boolean seenguard = false;
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    seenguard = false;
                }
                else if(grid[i][j]==1){
                    seenguard = true;
                }
                else if(seenguard){
                    grid[i][j]=3;
                }
            }
        }
        for(int i=0;i<m;i++){
            boolean seenguard = false;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==2){
                    seenguard = false;
                }
                else if(grid[i][j]==1){
                    seenguard = true;
                }
                else if(seenguard){
                    grid[i][j]=3;
                }
            }
        }
        for(int j=0;j<n;j++){
            boolean seenguard = false;
            for(int i=0;i<m;i++){
                if(grid[i][j]==2){
                    seenguard = false;
                }
                else if(grid[i][j]==1){
                    seenguard = true;
                }
                else if(seenguard){
                    grid[i][j]=3;
                }
            }
        }
        for(int j=0;j<n;j++){
            boolean seenguard = false;
            for(int i=m-1;i>=0;i--){
                if(grid[i][j]==2){
                    seenguard = false;
                }
                else if(grid[i][j]==1){
                    seenguard = true;
                }
                else if(seenguard){
                    grid[i][j]=3;
                }
            }
        }
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}