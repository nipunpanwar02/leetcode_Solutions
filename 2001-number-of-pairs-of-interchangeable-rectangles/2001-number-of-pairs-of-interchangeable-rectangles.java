class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Long> map = new HashMap<>();
        long count = 0;
        for(int i=0;i<rectangles.length;i++){
            double ratio = (double)(rectangles[i][0])/(rectangles[i][1]);
            if(map.containsKey(ratio)){
                count+=map.get(ratio);
                map.put(ratio,map.get(ratio)+1);
            }
            else{
                map.put(ratio,1l);
            }
        }
        return count;
    }
}