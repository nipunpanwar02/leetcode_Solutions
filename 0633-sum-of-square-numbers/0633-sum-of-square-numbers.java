class Solution {
    public boolean judgeSquareSum(int c) {
        for(int a=0; a<=Math.sqrt(c);a++){
            int low = 0;
            int high = (int)Math.sqrt(c);

            while(low <= high){
                int mid = low + (high-low)/2;

                long sum = (long) a*a + (long) mid*mid;

                if(sum == c) return true;
                else if(sum < c){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}