class Solution {
    public int numIdenticalPairs(int[] nums) {
        int hash[]=new int[101];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int count = 0;
        for(int i=0;i<101;i++){
            count += (hash[i]*(hash[i]-1))/2;
        }
        return count;
    }
}