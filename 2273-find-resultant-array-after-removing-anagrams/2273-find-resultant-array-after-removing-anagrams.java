class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        List<String> ans = new ArrayList<>();
        String prev = "";

        for(String word : words){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String current = new String(arr);

            if(!current.equals(prev)){
                ans.add(word);
                prev = current;
            }
            
        }
        return ans;
    }
}