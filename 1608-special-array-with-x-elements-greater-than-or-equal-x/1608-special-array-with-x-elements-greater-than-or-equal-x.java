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
        if(special == 0) return -1;
        int count = 0;
        for(int num : nums){
            if(num>=special){
                count++;
            }
        }
        return count==special ? special : -1;
    }
}