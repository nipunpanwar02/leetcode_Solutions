class Solution {
    public boolean checkStrings(String s1, String s2) {
        HashMap <Character,Integer> evenmap = new HashMap<>();
        HashMap <Character,Integer> oddmap = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if(i%2 == 0){
                evenmap.put(a,evenmap.getOrDefault(a,0)+1);
                evenmap.put(b,evenmap.getOrDefault(b,0)-1);
            }
            else{
                oddmap.put(a,oddmap.getOrDefault(a,0)+1);
                oddmap.put(b,oddmap.getOrDefault(b,0)-1);
            }
        }
        for (char key : evenmap.keySet()) {
            if (evenmap.get(key) != 0) {
                return false;
            }
        }

        for (char key : oddmap.keySet()) {
            if (oddmap.get(key) != 0) {
            return false;
            }
        }
        return true;
    }
}