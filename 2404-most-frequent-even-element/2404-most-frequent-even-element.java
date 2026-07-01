class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int maxfreq=0;
        int ans = -1;

        for(int num:map.keySet()){
            if(map.get(num)>maxfreq){
                maxfreq=map.get(num);
                ans = num;
            }
            else if(map.get(num)==maxfreq && num < ans){
                ans = num;
            }
        }
        return ans;
    }
}