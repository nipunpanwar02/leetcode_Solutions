class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for(int candy : candies){
            sum += candy;
        }
        if(sum<k){
            return 0;
        }
        int low = 1;
        int high = 0;
        for(int candy : candies){
            high = Math.max(high,candy);
        }
        while(low < high){
            int mid = low + (high - low +1)/2;

            long required = 0;
            for(int candy : candies){
                required += candy/mid;
            }
            if(required >= k){    //The condition is bcoz if there are more piles then we can give more no. of candies to the students..//
                low = mid;
            }
            else{
                high = mid-1;
            }
        }
        return low;  //Here low - 1 bcoz we want the maximum feasible ans and low represents the ans where it becomes first non-feasible..thats why we use low - 1//
    }
}