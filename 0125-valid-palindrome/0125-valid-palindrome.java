class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i =0;
        int j = s.length()-1;

        while(i<j){
            char c = s.charAt(i);
            char h = s.charAt(j);
            if(c!=h){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}