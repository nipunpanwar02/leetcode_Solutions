class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int low = 0;
        int high = nums.length;

        while(low<high){
            int mid = low + (high-low)/2;

            if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        int left = low;

        if(left == nums.length || nums[left] != target){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }

        low = 0;
        high = nums.length;

        while(low<high){
            int mid = low + (high-low)/2;

            if(nums[mid]<=target){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        int right = low - 1;
        arr[0]=left;
        arr[1]=right;
        return arr;
    }
}