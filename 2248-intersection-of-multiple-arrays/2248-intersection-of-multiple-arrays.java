class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] hash = new int[1001];
        for(int num:nums[0]){
            hash[num]++;
        }
        for(int i=1;i<nums.length;i++){
            int[] freq = new int[1001];
            for(int val:nums[i]){
                freq[val]++;
            }
            for(int j=0;j<1001;j++){
                hash[j] = Math.min(hash[j],freq[j]);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<1001;i++){
            while(hash[i]>0){
                ans.add(i);
                hash[i]--;
            }
        }
        return ans;
    }
}