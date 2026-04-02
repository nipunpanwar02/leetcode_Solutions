class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int maxProduct = nums[0];

        for(int i =1;i<nums.length;i++){
            int product = nums[i];
//here we do swap bcoz when a product i negative then the max and min value swaps as negative sign swap the sign..//
            if(product<0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(product,max * product);
            min = Math.min(product,min * product);
            maxProduct = Math.max(maxProduct,max);
        }
        return maxProduct;
    }
}