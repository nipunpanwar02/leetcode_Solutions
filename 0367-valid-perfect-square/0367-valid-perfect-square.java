class Solution {
    public boolean isPerfectSquare(int num) {
        if(num <=1) return true;
        int low = 0;
        int high = num;
        boolean isPerfect = false;

        while(low < high){
            int mid = low + (high - low)/2;

            if((long)mid*mid <= num){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        if((low-1)*(low-1) == num){
            isPerfect = true;
        }
        return isPerfect;
    }
}