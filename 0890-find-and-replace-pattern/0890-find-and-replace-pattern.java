class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for(String word : words){
            HashMap<Character,Character> patterntoword = new HashMap<>();
            HashMap<Character,Character> wordtopattern = new HashMap<>();

            boolean valid = true;

            for(int i=0;i<pattern.length();i++){

                char p = pattern.charAt(i);
                char w = word.charAt(i);

                if(!patterntoword.containsKey(p) && !wordtopattern.containsKey(w)){
                    patterntoword.put(p,w);
                    wordtopattern.put(w,p);
                }
                else{
                    if(patterntoword.getOrDefault(p,'#')!=w || wordtopattern.getOrDefault(w,'#')!=p){
                        valid = false;
                        break;
                    }
                }
                //we are using '#' here bcoz if suppose p is not present then it will show null pointer exception thats why getOrDefault if p is not present then it will return #..//
            }
            if(valid){
                ans.add(word);
            }
        }
        return ans;
    }
}