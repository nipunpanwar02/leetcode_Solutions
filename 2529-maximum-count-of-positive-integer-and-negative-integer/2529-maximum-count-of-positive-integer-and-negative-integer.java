class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n;

        while(low < high){
            int mid = low + (high - low)/2;

            if(nums[mid] < 0){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        int lowerbound = low;

        low = 0;
        high = n;

        while(low < high){
            int mid = low + (high - low)/2;

            if(nums[mid] <= 0){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        int upperbound = low;
        
        return Math.max(lowerbound, n - upperbound);
    }
}