class Solution {
    public int numOfPairs(String[] nums, String target) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word:nums){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        int count = 0;

        for(String word:nums){
            if(target.startsWith(word)){
                String suffix = target.substring(word.length());
                if(map.containsKey(suffix)){
                if(suffix.equals(word)){
                    count+=map.get(suffix) - 1;
                }
                else{
                    count+=map.get(suffix);
                }
            }
            }
        }
        return count;
    }
}