class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
        }
        int[] hash = new int[max+2];  //we increase the size of hash array by 1 bcoz we have to include the max index in the next loop.So that it can check for max index too.//
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<=max;i++){
            boolean left = (i==0 || hash[i-1]==0);
            boolean right = hash[i+1]==0;
            if(hash[i]==1 && left && right){
                ans.add(i);
            }
        }
        return ans;
    }
}