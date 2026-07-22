class Solution {
    public String largestGoodInteger(String num) {
        char check = '#';

        for(int i=0;i<=num.length()-3;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                if(num.charAt(i)>check){
                    check = num.charAt(i);
                }
            }
        }
        if(check == '#'){
            return "";
        }
        return ""+check+check+check;
    }
}