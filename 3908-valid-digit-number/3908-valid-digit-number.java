class Solution {
    public boolean validDigit(int n, int x) {
        int first = 0;
        int temp = n;
        while (temp > 0) {
            first = temp % 10;
            temp = temp / 10;
        }

        if(first != x){
            while (n > 0) {
            int digit = n % 10;

            if (digit == x) {
                return true;
            }

                n = n / 10;
            }
        }

       
        return false;
    }
}