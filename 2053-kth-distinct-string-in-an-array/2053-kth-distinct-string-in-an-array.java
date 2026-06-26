class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:arr){
            if(map.get(s)==1){
                ans.add(s);
            }
        }
        if(ans.size()<k){
            return "";
        }
        else{
            return ans.get(k - 1);
        }
    }
}