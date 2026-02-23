class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        
        int minLength = Math.min(word1.length(), word2.length());
        
        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        
        result.append(word1.substring(minLength));
        result.append(word2.substring(minLength));
        
        return result.toString();
    }
}