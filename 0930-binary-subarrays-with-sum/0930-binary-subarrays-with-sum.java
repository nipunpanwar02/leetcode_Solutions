class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int currprefix = 0;
        map.put(0,1);
        int ans = 0;

        for(int num : nums){
            currprefix+=num;
            int need = currprefix - goal;

            if(map.containsKey(need)){
                ans+=map.get(need);
            }
            map.put(currprefix, map.getOrDefault(currprefix,0)+1);
        }
        return ans;
    }
}