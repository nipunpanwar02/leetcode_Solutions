class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int target : set){
            int low = 0;
            int high = n;

            while(low < high){
                int mid = low + (high-low)/2;

                if(nums[mid] < target){
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
                int mid = low + (high-low)/2;

                if(nums[mid] <= target){
                    low = mid + 1;
                }
                else{
                    high = mid;
                }
            }
            int upperbound = low;
            // We can also create a map and count += map.get(target)//
            if(lowerbound>0 && upperbound<n){
                count += upperbound - lowerbound;
            }
        }
        return count;
    }
}