class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int doubledigit = 0;

        for(int num : nums){
            if(num<10){
                single+=num;
            }
            else{
                doubledigit+=num;
            }
        }
        return single != doubledigit;
    }
}