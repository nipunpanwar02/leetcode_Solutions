class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0]!=b[0]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        for(int i=0;i<mat.length;i++){
            int count = 0;
            int low = 0;
            int high = mat[i].length;

            while(low < high){
                int mid = low + (high - low)/2;

                if(mat[i][mid]==0){
                    high = mid;
                }
                else{
                    low = mid + 1;
                }
            }
            count = low;
            pq.offer(new int[]{count,i});
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll()[1];
        }
        return ans;
    }
}