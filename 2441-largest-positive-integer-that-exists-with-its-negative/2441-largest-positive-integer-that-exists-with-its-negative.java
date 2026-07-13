class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
            if(set.contains(-num)){
                max = Math.max(max,num);
            }
        }
        return max;
    }
}