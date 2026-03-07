class Solution {
    public int largestAltitude(int[] gain) {
        int prefix[]=new int[gain.length+1];
        for(int i=1;i<=gain.length;i++){
            prefix[i]=prefix[i-1]+gain[i-1];
        }
        int max=prefix[0];
        for(int i=1;i<prefix.length;i++){
            max=Math.max(max,prefix[i]);
        }
        return max;
    }
}