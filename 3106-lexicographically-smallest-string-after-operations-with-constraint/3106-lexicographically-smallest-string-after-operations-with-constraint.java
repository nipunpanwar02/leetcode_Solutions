class Solution {
    public String getSmallestString(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i] == 'a'){
                continue;
            }
            //Here we do this bcoz we can do it in a circular way like we can go from z -> a as well as b -> a from them the shortest path we will follow..//
            
            int backside = arr[i] - 'a';
            int frontside = 'z' - arr[i] +1;

            int moves = Math.min(backside, frontside);
            if(moves <= k){
                arr[i] = 'a';
                k = k-moves;
            }
            else{
                arr[i] = (char)(arr[i] - k);
                break;
            }
        }
        return new String(arr);
    }
}