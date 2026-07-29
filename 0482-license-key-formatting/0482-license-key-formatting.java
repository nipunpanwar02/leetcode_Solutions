class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch != '-'){
                sb.append(Character.toUpperCase(ch));
            }
        }
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for(int i=sb.length()-1 ; i>=0 ;i--){
            ans.append(sb.charAt(i));
            count++;

            if(count == k && i!=0){
                ans.append('-');
                count = 0;
            }
        }
        return ans.reverse().toString();
    }
}