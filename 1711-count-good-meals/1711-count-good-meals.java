class Solution {
    public int countPairs(int[] deliciousness) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int mod = 1000000007;
        long count = 0;

        for(int num : deliciousness){
            for(int power = 1; power <= 2*((int) Math.pow(2,20));power*=2){
                int need = power - num;
                
                if(map.containsKey(need)){
                    count = (count + map.get(need)) % mod ;
                }
            }
            map.put(num, map.getOrDefault(num,0) +1);
        }
        return (int)count;
        
    }
}