class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        for(String s:words1){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        for(String s:words1){
            if(map1.get(s)==1){
                list1.add(s);
            }
        }
        HashMap<String,Integer> map2 = new HashMap<>();
        List<String> list2 = new ArrayList<>();
        for(String s:words2){
            map2.put(s,map2.getOrDefault(s,0)+1);
        }
        for(String s:words2){
            if(map2.get(s)==1){
                list2.add(s);
            }
        }
        int count=0;
        for(int i=0;i<list2.size();i++){
            if(list1.contains(list2.get(i))){
                count++;
            }
        }
        return count;
    }
}