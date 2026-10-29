class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int size = bloomDay.length;
        if((long) m*k > size){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = 0;

        for(int flower : bloomDay){
            low = Math.min(flower, low);
            high = Math.max(flower, high);
        }

        while(low < high){
            int mid = low + (high - low)/2;

            int count = 0;
            int bouquets = 0;

            for(int i=0; i<size; i++){
                if(bloomDay[i] <= mid){
                    count++;
                    if(count==k){
                        bouquets++;
                        count = 0;
                    }
                }
                else{
                    count = 0;
                }
            }
            if(bouquets < m){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}