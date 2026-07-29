class Solution {
    public String addStrings(String num1, String num2) {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = arr1.length - 1;
        int j = arr2.length - 1;

        int carry = 0;
        while(i>=0 || j>=0){
            int n1 = 0;
            int n2 = 0;

            if(i>=0){
                n1 = arr1[i] - '0';
            }
            if(j>=0){
                n2 = arr2[j] - '0';
            }
            int sum = n1 + n2 + carry;
            sb.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}