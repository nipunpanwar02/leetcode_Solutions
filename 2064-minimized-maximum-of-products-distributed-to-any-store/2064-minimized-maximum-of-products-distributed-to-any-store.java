class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        if(n==1){
            int count = 0;
            for(int quantity : quantities){
                count+=quantity;
            }
            return count;
        }
        int size = quantities.length;
        int low = 1;
        int high = 0;
        for(int quantity : quantities){
            high = Math.max(quantity, high);
        }

        while(low < high){
            int mid = low + (high - low)/2;

            int count = 0;
            int stores = 0;

            for(int i = 0; i < size; i++){
                int pair = 0;
                if(quantities[i]%mid!=0){
                    pair = quantities[i]/mid + 1;
                }
                else{
                    pair = quantities[i]/mid;
                }
                count+=pair;
            }
            if(count > n){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}