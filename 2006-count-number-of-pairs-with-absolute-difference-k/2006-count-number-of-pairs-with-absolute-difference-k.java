class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) +1);

            if(map.containsKey(num - k)){
                count+=map.get(num - k);
            }
            if(map.containsKey(num + k)){
                count+=map.get(num + k);
            }
        }
        return count;
    }
}