class Solution {
    public int superPow(int a, int[] b) {
        int mod = 1337;
        int result = 1;
        for(int digit=0;digit<b.length;digit++){
            result = (power(result,10,mod)*power(a,b[digit],mod)) % mod;
        }
        return result;
    }
    public int power(int base, int exp, int mod){
        int result = 1;
        base = base % mod;

        for(int i = 0; i < exp; i++){
            result = (result * base) % mod;
        }

        return result;
    }
}