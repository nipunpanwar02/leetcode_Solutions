class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set= new HashSet<>();

        for(String email : emails){
            String[] unique = email.split("@");
            String local = unique[0];
            String domain = unique[1];

            int plus = local.indexOf('+');
            if(plus!= -1){
                local = local.substring(0,plus);
            }

            local = local.replace(".", "");

            set.add(local+ "@" +domain);
        }
        return set.size();
    }
}