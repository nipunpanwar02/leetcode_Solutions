class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        boolean  alternate = true;
        for(int i=0;i<grid.length;i++){
            if(i%2==0){
                for(int j=0;j<grid[0].length;j++){
                    if(alternate){
                        list.add(grid[i][j]);
                    }
                    alternate = !alternate;
                }
            }
            else{
                for(int j=grid[0].length-1;j>=0;j--){
                    if(alternate){
                        list.add(grid[i][j]);
                    }
                    alternate = !alternate;
                }
            }
        }
        return list;
    }
}