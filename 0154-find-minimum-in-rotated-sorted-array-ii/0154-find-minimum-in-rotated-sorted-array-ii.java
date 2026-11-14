class Solution {
    public int findMin(int[] nums) {
        int target = Integer.MAX_VALUE;

        for(int num : nums){
            target = Math.min(target,num);
        }
        return target;
    }
}