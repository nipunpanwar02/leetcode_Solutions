class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();

        for(char ch : number.toCharArray()){
            if(ch != ' ' && ch != '-'){
                sb.append(ch);
            }
        }

        StringBuilder ans = new StringBuilder();
        int i = 0;

        while(sb.length() - i>4){
            ans.append(sb.substring(i,i+3));
            ans.append('-');
            i+=3;
        }
        int remain = sb.length() - i;

        if(remain == 4){
            ans.append(sb.substring(i,i+2));
            ans.append('-');
            ans.append(sb.substring(i+2));
        }
        else{
            ans.append(sb.substring(i));
        }
        return ans.toString();
    }
}