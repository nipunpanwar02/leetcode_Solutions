class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int mincommon = Integer.MAX_VALUE;
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                mincommon = Math.min(mincommon,num);
            }
        }
        if(mincommon==Integer.MAX_VALUE) return -1;
        else{
            return mincommon;
        }
    }
}