class Solution {
    public double myPow(double x, int n) {
        long power = n;
        if(power < 0){
            power = -power;
        }

        double ans = 1;
        while(power > 0){
            if(power % 2 == 1){
                ans = ans * x;
            }
            x = x*x;
            power=power/2;
        }
        if(n<0){
            return 1/ans;
        }
        return ans;
    }
}