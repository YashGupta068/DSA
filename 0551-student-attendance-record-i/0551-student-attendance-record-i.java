class Solution {
    public boolean checkRecord(String s) {
         int c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                c++;
            }

            if(c>=2){
                return false;
            }

            if(i>=2 && s.charAt(i-2) == 'L' && s.charAt(i-1) =='L' && s.charAt(i)=='L'){
                return false;
            }

        }

        return true;
    }
}