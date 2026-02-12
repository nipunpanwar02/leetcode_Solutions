class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String s : sentences) {
            int words = 1; 
            int len = s.length();

            for (int i = 0; i < len; i++) {
                if (s.charAt(i) == ' ') {
                    words++;
                }
            }

            if (words > max) {
                max = words;
            }
        }

        return max;
    }
}
