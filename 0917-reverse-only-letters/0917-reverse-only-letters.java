class Solution {
    public boolean isletter(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left<right){
            if(!isletter(arr[left])){
                left++;
            }
            else if(!isletter(arr[right])){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}