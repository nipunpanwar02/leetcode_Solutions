class Solution {
    public List<List<Long>> splitPainting(int[][] segments) {
        TreeMap<Integer,Long> diff = new TreeMap<>();

        for(int i=0;i<segments.length;i++){
            int start = segments[i][0];
            int end = segments[i][1];
            int color = segments[i][2];

            diff.put(start, diff.getOrDefault(start,0L) + color);
            diff.put(end, diff.getOrDefault(end,0L) - color);
        }

        List<List<Long>> ans = new ArrayList<>();
        long currColor = 0;
        int prev = 0;

        for(int checkpoint : diff.keySet()){
            if(currColor!=0){
                ans.add(Arrays.asList((long) prev, (long) checkpoint, currColor));
            }
            currColor+=diff.get(checkpoint);
            prev = checkpoint;
        }
        return ans;
    }
}