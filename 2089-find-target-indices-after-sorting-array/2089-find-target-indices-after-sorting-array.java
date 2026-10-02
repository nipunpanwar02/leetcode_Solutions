class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length;

        while(low < high){
            int mid = low + (high - low)/2;

            if(nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        int start = low;

        if(start == nums.length || nums[start] != target){
            return list;
        }
        
        low = 0;
        high = nums.length;

        while(low < high){
            int mid = low + (high-low)/2;

            if(nums[mid]<=target){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        int end = low;
        for(int i=start;i<end;i++){
            list.add(i);
        }
        return list;
    }
}