class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int need = target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(need==nums[j]){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] ans = new int[2];
        for(int i=0;i<2;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}