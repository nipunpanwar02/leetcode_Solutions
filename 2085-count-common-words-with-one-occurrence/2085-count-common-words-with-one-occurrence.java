class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        for(String s:words1){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        for(String s:words2){
            map2.put(s,map2.getOrDefault(s,0)+1);
        }
        int count=0;
        for(String s:map1.keySet()){
            if(map1.get(s)==1 && map2.getOrDefault(s,0)==1){ //here we dont write map1.getOrDefault because alreday in for loop we tell (s:map1.keySet) that means the key is 100% persent in map1 so there is no case that key is not present and default->0.//
                count++;
            }
        }
        return count;
    }
}