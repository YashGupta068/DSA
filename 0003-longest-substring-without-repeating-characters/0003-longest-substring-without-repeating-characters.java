class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int freq[] = new int[128];

        int windowSt = 0;
        int windowEnd = 0;
        int maxLen = 0;
        while(windowEnd < n){
            int index = s.charAt(windowEnd);
            freq[index]++;

            while(freq[index] > 1){
                int left = s.charAt(windowSt);
                freq[left]--;
                windowSt++;
            }

            int len = windowEnd - windowSt + 1;
            maxLen = Math.max(maxLen,len);

            windowEnd++;
        }

        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna