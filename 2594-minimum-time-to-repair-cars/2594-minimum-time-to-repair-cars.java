class Solution {
    public long repairCars(int[] ranks, int cars) {
        int res = Integer.MAX_VALUE;
        for(int rank : ranks){
           res = Math.min(rank,res);
        }
        long low = 1;
        long high = (long) res * cars * cars;

        while(low < high){
            long mid = low + (high - low)/2;
            long repaired = 0;
            for(int rank : ranks){
                repaired += (long) Math.sqrt(mid/rank);
            }
            if(repaired >= cars){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}