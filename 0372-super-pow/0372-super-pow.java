class Solution {

    public int superPow(int a, int[] b) {
        int mod = 1337;
        int result = 1;
        a = a % mod;

        for(int digit=0;digit<b.length;digit++){
            result = (power(result,10,mod) * power(a,b[digit],mod)) % mod;//here we use mod bcoz if we dont use it then it shows error for large exp. value...//
        }
        return result;
    }

    public int power(int base, int exp, int mod){
        int result = 1;
        base = base % mod;

        while(exp > 0){

            if(exp % 2 == 1)
            result = (result * base) % mod;
            base = (base * base) % mod;
            exp = exp / 2;
        }
        return result;
    }
}