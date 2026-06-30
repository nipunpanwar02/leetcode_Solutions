class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0;i<matches.length;i++){
            map.put(matches[i][0],map.getOrDefault(matches[i][0],0));
        }
        for(int i=0;i<matches.length;i++){
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        for(int player : map.keySet()){
            if(map.get(player)==0){
                list1.add(player);
            }
            else if(map.get(player)==1){
                list2.add(player);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}