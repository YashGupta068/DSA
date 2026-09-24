class Solution {
    public String maximumOddBinaryNumber(String s) {
        String res = "";
        int freq[] = new int[2];

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '0'){
                freq[0]++;
            }else{
                freq[1]++;
            }
        }

        if(freq[1] == 1){
            for(int i=0;i<freq[0];i++){
                res+="0";
            }
            res+="1";

            return res;
        }

        int ones = freq[1]--;

        for(int i=0;i<freq[1];i++){
            res+="1";
        }
        for(int i=0;i<freq[0];i++){
            res+="0";
        }

        res+="1";

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna