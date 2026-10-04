class Solution {
    public int arrangeCoins(int n) {
        if(n<=1) return n;
        int low = 0;
        int high = n;
        long count = 0;

        while(low < high){
            int mid = low + (high - low)/2;

            count = (long)mid * (mid+1)/2;

            if(count <= n){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        // We return low - 1 bcoz the value at low is the first invalid value but we want the valid value like till the valid step so low - 1..//
        return low - 1;
    }
}