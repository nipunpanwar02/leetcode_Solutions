class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        for(int weight : weights){
            low = Math.max(weight,low);
        }
        int sum = 0;
        for(int weight:weights){
            sum+=weight;
            
        }
        int high = sum;

        while(low < high){
            int mid = low + (high-low)/2;
            int needdays = 1;
            int sumweight = 0;
            for(int weight:weights){
                if(sumweight + weight > mid){
                    needdays++;
                    sumweight = weight;
                }
                else{
                    sumweight+=weight;
                }
            }
            if(needdays <= days){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}