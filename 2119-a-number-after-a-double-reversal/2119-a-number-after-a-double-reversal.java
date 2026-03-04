class Solution {
    public boolean isSameAfterReversals(int x) {
        boolean isSameAfterReversals=true;
        int org = x;
        int rev = 0;
        while(x!=0){
            int lastdigit=x%10;
            rev = rev*10 + lastdigit;
            x=x/10;
        }
        int temp = rev;
        int rev2 = 0;
        while(temp!=0){
            int last = temp%10;
            rev2=rev2*10 + last;
            temp=temp/10;
        }
        if(rev2!=org){
            isSameAfterReversals=false;
        }
        return isSameAfterReversals;
    }
}