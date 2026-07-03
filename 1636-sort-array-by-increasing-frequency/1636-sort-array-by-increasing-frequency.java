class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num,0) +1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a,b) -> {
            if(a.getValue().equals(b.getValue())){
                return b.getKey()-a.getKey();
            }
            else{
                return a.getValue()-b.getValue();
            }
        });

        int[] ans = new int[nums.length];
        int index = 0;

        for(Map.Entry<Integer,Integer> entry:list){
            for(int i=0;i<entry.getValue();i++){
                ans[index++] = entry.getKey();
            }
        }
        return ans;
    }
}