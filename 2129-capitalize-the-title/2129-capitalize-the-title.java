class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() <= 2) {
                words[i] = words[i].toLowerCase();
            } else {

                String first = words[i].substring(0, 1).toUpperCase();
                String rest = words[i].substring(1).toLowerCase();

                words[i] = first + rest;
            }
        }

        return String.join(" ", words);
    }
}