class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diff = new int[101];

        for(int i=0; i<logs.length; i++){

            int birth = logs[i][0];
            int death = logs[i][1];

            diff[birth - 1950]++;
            diff[death - 1950]--;

        }
        int pop = 0;
        int maxpop = Integer.MIN_VALUE;
        int year = 1950;

        for(int i=0;i<diff.length;i++){
            pop += diff[i];

            if(pop>maxpop){
                maxpop = pop;
                year = 1950 + i;
            }
        }
        return year;
    }
}