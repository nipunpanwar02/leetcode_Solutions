class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int hash[]=new int[101];

        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
//Here we create a hash(freq) array with prefix sum.//
        for(int i=1;i<101;i++){
            hash[i]+=hash[i-1];      //prefix sum condition.//
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[i]=0;
            }
            else{
                ans[i]=hash[nums[i]-1];
            }
        }
        return ans;
    }
}