// class Solution {
//     public long countBadPairs(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();

//         long count = 0;
//         for(int i=0; i<nums.length;i++){
//             int good = (nums[i] - i);

//             if(map.containsKey(good)){
//                 //count += total till that index - good pairs till that index//
//                 count += i - map.get(good);
//                 map.put(good,map.get(good) + 1);
//             }
//             else{
//                 count += i;
//                  map.put(good, 1);
//             }
//         }
//         return count;
//     }
// }
//if we use if-else then there is 2 lookups in hashmap but if we use getOrDefault then it is only 1 lookup and also getOrDefault is more interview friendly then we have to use it instead..//



class Solution {
    public long countBadPairs(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();

        long count = 0;
        for(int i=0;i<nums.length;i++){
            int good = (nums[i] - i);

            int same = map.getOrDefault(good,0);
            count += i - same;

            map.put(good,same+1);
        }
        return count;
    }
}