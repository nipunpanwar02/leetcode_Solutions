class Solution {
    public int minMoves(int[] nums, int limit) {
        int[] diff = new int[2*limit +2]; //bcoz max possible is (limit+limit+1) +1 to get that index..//
        int n = nums.length;

        for(int i=0;i<n/2;i++){
            int left = i;
            int right = n-i-1;

            int low = Math.min(nums[left],nums[right]);
            int high = Math.max(nums[left],nums[right]);
            int sum = low + high;
            // Create diff arr by taking low, high, sum as checkpoints.//
            diff[2] += 2;       //both have to change..//
            diff[low+1]--;      //only 1 have to change..//
            diff[sum]--;        //0 change..//
            diff[sum+1]++;      //1 change..//
            diff[high+limit+1]++;       //2 change..//
        }
        int count = Integer.MAX_VALUE;
        int curr = 0;

        for(int target=2; target<=2*limit; target++){
            curr += diff[target];
            count = Math.min(count, curr);
        }
        return count;
    }
}