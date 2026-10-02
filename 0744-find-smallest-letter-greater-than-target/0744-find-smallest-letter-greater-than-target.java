class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length;
        
        while(low<high){
            int mid = low + (high-low)/2;

            if(letters[mid]>target){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        //Approach-2 -> return letters[low % letters.length];
        if(low == letters.length){
            return letters[0];
        }
        return letters[low];
    }
}