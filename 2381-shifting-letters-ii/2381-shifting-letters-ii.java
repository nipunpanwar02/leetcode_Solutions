class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();

        int[] diff = new int[n];
        for(int i=0;i<shifts.length;i++){
            int left = shifts[i][0];
            int right = shifts[i][1];
            int dir = shifts[i][2];

            if(dir == 1){
                diff[left] = diff[left] + 1;
                if(right+1 < n){
                    diff[right+1] = diff[right+1] - 1;
                }
            }
            else{
                diff[left] = diff[left] - 1;
                if(right+1 < n){
                    diff[right+1] = diff[right+1] + 1;
                }
            }
        }
        for(int i=1;i<n;i++){
            diff[i] = diff[i] + diff[i-1];
        }
        char[] arr = s.toCharArray();
        for(int i =0;i<n;i++){
            int value = arr[i] - 'a';
            value = value + diff[i];
            value = ((value%26)+26)%26;     // To handle the negative diff[i] value we added this it makes it positive and dont throw error..//
            arr[i] = (char)(value + 'a');
        }
        return new String(arr);
    }
}