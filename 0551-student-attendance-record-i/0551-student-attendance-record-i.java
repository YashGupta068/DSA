class Solution {
    public boolean checkRecord(String s) {

        int countA = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                countA++;

                if (countA >= 2) {
                    return false;
                }
            }

            if (i >= 2 &&
                s.charAt(i - 2) == 'L' &&
                s.charAt(i - 1) == 'L' &&
                s.charAt(i) == 'L') {
                return false;
            }
        }

        return true;
    }
}