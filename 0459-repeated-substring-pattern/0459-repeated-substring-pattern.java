class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String combine = s+s;
        String sub = combine.substring(1,combine.length()-1);
        return sub.contains(s);
    }
}