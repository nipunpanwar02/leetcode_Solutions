class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int currprefix = 0;
        int ans = 0;
        map.put(0,1);

        for(int num : nums){
            currprefix+=num;

            int need = currprefix - k;

            if(map.containsKey(need)){
                ans+=map.get(need);
            }
            map.put(currprefix, map.getOrDefault(currprefix,0)+1);
        }
        return ans;
    }
}