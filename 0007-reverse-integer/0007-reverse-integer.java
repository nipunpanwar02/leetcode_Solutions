class Solution {
    public int reverse(int x) {

        if (x < 0) {
            int ans = x * -1;
            return -1 * rev(ans);
        } else
            return rev(x);
    }

    public static int rev(int n) {

        long ans = 0;
        for (int i = n; i > 0; i = i / 10) {
            ans = ans * 10 + i % 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
        return (int)ans;
    }
}