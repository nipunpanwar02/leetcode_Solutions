class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int num : nums){
            //bcoz absolute value so num[i]-num[j] = k or -k thats why 2 cases..//
            if(map.containsKey(num - k)){
                count+=map.get(num - k);
            }
            if(map.containsKey(num + k)){
                count+=map.get(num + k);
            }
            map.put(num, map.getOrDefault(num,0) +1);
        }
        return count;
    }
}