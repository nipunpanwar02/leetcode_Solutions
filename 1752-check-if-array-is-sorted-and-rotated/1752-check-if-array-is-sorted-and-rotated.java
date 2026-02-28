class Solution {
    public boolean check(int[] nums) {
        boolean check = true;
        int count =0;
        int n = nums.length;

// %n is used to do circular check like to check last with first digit.//
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
            if(count>1){
                check = false;
            }
        }
        return check;
    }
}