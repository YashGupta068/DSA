class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        int len = 0;
        int maxLen = Integer.MIN_VALUE;
        int freq[] = new int[26];
        int uniqueCount = 0;
        int windowStart = 0;
        int windowEnd = 0;
        
        while(windowEnd < n){
            int index = s.charAt(windowEnd) - 97;
            
            if(freq[index]==0){
                freq[index]++;
                uniqueCount++;
            }else{
                freq[index]++;
            }
            
            if(uniqueCount == k){
                len = windowEnd - windowStart + 1;
                maxLen = Math.max(maxLen,len);
            }else if(uniqueCount > k ){
                while(windowEnd > windowStart && uniqueCount > k){
                    index = s.charAt(windowStart) - 97;
                    freq[index]--;
                    if(freq[index] == 0){
                        uniqueCount--;
                    }
                    windowStart++;
                }
                
            }
            
            windowEnd++;
        }
        
        return maxLen == Integer.MIN_VALUE ? -1 : maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna