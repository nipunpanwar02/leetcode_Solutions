class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for(int i = 0; i < s.length() ; i++){
            count += valid(s,i,i);  //agr odd length hai then this.
            count += valid(s,i,i+1);  //agr even length hai then this. 
        }
        return count;
    }

    public int valid(String s,int l,int r){
        int count = 0;
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
}















