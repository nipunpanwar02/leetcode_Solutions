class Solution {
    public boolean sumGame(String num) {
        int leftsum = 0;
        int rightsum = 0;
        int leftq = 0;
        int rightq = 0;

        int n = num.length();

        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                leftq++;
            }
            else{
                leftsum+=num.charAt(i) - '0';
            }
        }
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                rightq++;
            }else{
                rightsum+=num.charAt(i) - '0';
            }
        }

        int diff = leftsum - rightsum;
        int qdiff = leftq - rightq;

        if(qdiff%2!=0){
            return true;
        }
        if(diff == -(qdiff/2)*9){
            return false;
        }
        return true;
    }
}