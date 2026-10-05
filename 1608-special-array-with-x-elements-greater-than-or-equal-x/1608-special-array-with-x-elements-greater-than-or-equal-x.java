class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0;
        int high = n;

        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= n - mid){
                high = mid;
            }
            else{
                low = mid + 1;
            }    
        }
        int special = n - low;

        // if(special == 0) return -1;
        // int count = 0;
        // for(int num : nums){
        //     if(num>=special){
        //         count++;
        //     }
        // }
        // return count==special ? special : -1;
        // here special = 3 and low = 2 so it means low is the number from which there are special no of numbers greater then or equal to special like the starting point is num[low] till n and hence num[low-1] must have to smaller then special bcoz it is sorted..//
        
        if(special == 0) return -1;
        if(low > 0 && nums[low - 1] >= special){
            return -1;
        }
        return special;
    }
}