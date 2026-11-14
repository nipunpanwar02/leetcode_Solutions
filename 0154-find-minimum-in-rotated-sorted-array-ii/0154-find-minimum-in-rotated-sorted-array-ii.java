class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int target = Integer.MAX_VALUE;
        for(int num : nums){
            target = Math.min(target,num);
        }

        while(low < high){
            int mid = low + (high - low)/2;

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low] < nums[mid]){
                if(target>=nums[low] && target<nums[mid]){
                    high = mid -1 ;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return target;
    }
}