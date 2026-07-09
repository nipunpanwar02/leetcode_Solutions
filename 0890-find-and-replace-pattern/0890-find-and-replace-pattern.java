class Solution {
    public String getSignature(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int id = 1;

        for(char ch : str.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,id);
                id++;
            }
            sb.append(map.get(ch));
            sb.append("#");    // if we dont add this then it will take 10 as 2 diff id as 1 and 0 that's why we add # after every id..//
        }
        return sb.toString();
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        String patternSignature = getSignature(pattern);

        for(String word : words){
            if(patternSignature.equals(getSignature(word))){
                ans.add(word);
            }
        }
        return ans;
    }
}