class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        long count = 0;
        for(int i=0; i<nums.length;i++){
            int good = (nums[i] - i);

            if(map.containsKey(good)){
                count += i - map.get(good);
                map.put(good,map.get(good) + 1);
            }
            else{
                count += i;
                 map.put(good, 1);
            }
        }
        return count;
    }
}