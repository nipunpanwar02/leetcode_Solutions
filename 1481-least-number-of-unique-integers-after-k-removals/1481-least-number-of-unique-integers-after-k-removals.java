class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a,b) -> a.getValue() - b.getValue());

        int unique = map.size();

        for(Map.Entry<Integer,Integer> entry : list){
            if(k>=entry.getValue()){
                k-=entry.getValue();
                unique--;
            }
            else{
                break;
            }
        }
        return unique;
    }
}