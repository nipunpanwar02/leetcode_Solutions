class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        //we can also directly use hashset in next step like this or we can just convert hashset to arraylist and then get element of hashset 1 by 1..//
    //  int i=0;
    //  for(int num:set2){
    //      ans[i++]=num;
    //  }

        ArrayList<Integer> list = new ArrayList<>(set2);  //convert hashset to arraylist..//
        int[] ans = new int[set2.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}