class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];

        for(int i=0;i<trips.length;i++){
            int left = trips[i][1];
            int right = trips[i][2];
            int passengers = trips[i][0];

            diff[left] += passengers;
            diff[right] -= passengers;
        }
        int currpassengers = 0;

        for(int i=0;i<1001;i++){
            currpassengers += diff[i];
            if(currpassengers > capacity){
                return false;
            }
        }
        return true;
    }
}