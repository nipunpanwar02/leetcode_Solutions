class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        boolean check = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            int rem = prefix % k;
            if(map.containsKey(rem)){
                int length = i - map.get(rem);
                if(length >= 2){
                    check = true;
                }
            }
            else{
                map.put(rem,i);
            }

        }
        return check;
    }
}