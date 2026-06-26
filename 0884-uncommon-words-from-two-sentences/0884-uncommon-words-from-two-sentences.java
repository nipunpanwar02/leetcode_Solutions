class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(String s:s1.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:s2.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:s1.split(" ")){
            if(map.get(s)==1){
                ans.add(s);
            }
        }
        for(String s:s2.split(" ")){
            if(map.get(s)==1){
                ans.add(s);
            }
        }
        return ans.toArray(new String[0]);
    }
}