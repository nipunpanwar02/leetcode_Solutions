class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int currprefix = 0;
        int ans = 0;
        map.put(0,1);

        for(int num : nums){
            currprefix += num;
            int rem = currprefix % k;
            //for negative rem..//
            if(rem<0){
                rem = rem + k;
            }

            if(map.containsKey(rem)){
                ans += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem,0) + 1);
        }
        return ans;
    }
}