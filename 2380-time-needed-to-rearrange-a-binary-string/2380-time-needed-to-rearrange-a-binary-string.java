class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int zero = 0;
        int totaltime = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                zero++;
            }
            else{
                if(zero == 0){
                    continue;
                }
                int passtime = zero;
                int waittime = totaltime + 1;
                //Max of passtime and waittime on 1's iteration from left to right..//

                if(passtime > waittime){
                    totaltime = passtime;
                }
                else{
                    totaltime = waittime;  //bcoz that 1 have to wait till its turn too..//
                }
            }
        }
        return totaltime;
    }
}