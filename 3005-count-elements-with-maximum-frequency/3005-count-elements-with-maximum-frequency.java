class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        int total = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int[] hash = new int[max+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int maxfreq = 0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]>maxfreq){
                maxfreq=hash[i];
            }
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==maxfreq){
                total+=hash[i];
            }
        }
        return total;
    }
}