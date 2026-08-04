class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        long[] suffix = new long[n];
        suffix[n-1] = shifts[n-1];

        for(int i =n-2;i>=0;i--){
            suffix[i] = suffix[i+1] + shifts[i];
        }
        char[] arr = s.toCharArray();
        for(int i=0;i<n;i++){
            int value = arr[i] - 'a';
            value = value + (int)(suffix[i] % 26);
            value = value % 26;        //If it goes beyond alphabets to handle that..//
            arr[i] = (char)(value + 'a');
        }
        return new String(arr);
    }
}