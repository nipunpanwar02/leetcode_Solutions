class Solution {
    
    public int reverse(int n){
        int rev = 0;
        while(n!=0){
            int lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n=n/10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        long count = 0;
        int mod = 1000000007;

        for(int i:nums){
            int a =(i-reverse(i));

            if(map.containsKey(a)){
                count = (count + (map.get(a)))%mod;
                map.put(a,map.get(a) + 1);
            }
            else{
                map.put(a, 1l);
            }
        }
        return count;
    }
}