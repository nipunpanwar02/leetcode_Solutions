class Solution {
    private String multiplyOneDigit(String num1, char digit) {

        char[] arr1 = num1.toCharArray();
        int d = digit - '0';
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = arr1.length - 1; i >= 0; i--){
            int n = arr1[i] - '0';
            int product = n * d + carry;
            sb.append(product % 10);
            carry = product / 10;
        }

        while (carry > 0) {
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }

    private String addStrings(String num1, String num2) {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while(i>=0 || j>=0 || carry>0){
            int n1 = 0;
            int n2 = 0;

            if(i>=0){
                n1 = arr1[i] - '0';
                i--;
            }
            if(j>=0){
                n2 = arr2[j] - '0';
                j--;
            }
            int sum = n1 + n2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        char[] arr2 = num2.toCharArray();
        String ans = "0";
        int zeros = 0;

        for(int j = arr2.length - 1; j >= 0; j--){
            String partial = multiplyOneDigit(num1, arr2[j]);
            StringBuilder sb = new StringBuilder(partial);

            for(int k = 0; k < zeros; k++){
                sb.append('0');
            }
            ans = addStrings(ans, sb.toString());
            zeros++;
        }
        return ans;
    }
}