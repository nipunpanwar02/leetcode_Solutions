class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(word.length() == 1)return true ;


        char chFirst = word.charAt(1);
        int cap = 0 ; // smal 

        if(chFirst >= 'A' && chFirst <= 'Z'){
            cap = 1 ;
        }


        for(int i = 2 ; i < word.length() ; i++){

            char ch = word.charAt(i) ;

            int curr = 0 ;

            if(ch >= 'A' && ch <= 'Z'){
                curr = 1;
            }

            if(curr != cap)return false ; 
            

        }

        if(cap == 1){

            char c = word.charAt(0);

            if(c >= 'a' && c <= 'z')return false ;

        }

        return true ; 


    }
}


//


// small 
// big  USA  Happy // small  1 - n-1 saab same hona. chaye
// first big else small 
