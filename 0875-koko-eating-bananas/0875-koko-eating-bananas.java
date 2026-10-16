class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 0;
        for(int banana:piles){
            high = Math.max(banana,high);
        }
        while(low < high){
            int mid = low + (high - low)/2;

            int hours = 0;
            for(int bananas:piles){
                if(bananas%mid !=0){
                    hours+=bananas/mid + 1;
                }
                else{
                    hours+=bananas/mid;
                }
            }
            if(hours <= h){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}