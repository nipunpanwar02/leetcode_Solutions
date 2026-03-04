class Solution {
    public int reverse(int x) {
        int temp=0;
        if(x<0){
            temp=x*-1;
        }
        else{
            temp=x;
        }
        int rev = 0;
        while(temp>0){
            int lastdigit=temp%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)return 0;
            rev = rev*10+lastdigit;
            temp=temp/10;
        }
        if(x<0){
            rev = rev*-1;
        }
        return rev;
    }
}