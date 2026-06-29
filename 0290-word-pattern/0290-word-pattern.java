class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        String[] words = s.split(" ");

        if(pattern.length()!=words.length){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            char c1 = pattern.charAt(i);
            String c2 = words[i];

            if(map1.containsKey(c1) && !map1.get(c1).equals(c2)){
                return false;
            }
            else{
                map1.put(c1,c2);
            }

            if(map2.containsKey(c2) && map2.get(c2)!=c1){
                return false;
            }
            else{
                map2.put(c2,c1);
            }
        }
        return true;
    }
}