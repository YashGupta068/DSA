class Solution {
    public int[] concatWithReverse(int[] arr) {
        int n = arr.length;
        int res[] = new int[n*2];

        int j = 0;

        for(int i=0;i<n;i++){
            res[j++] = arr[i];
        }

        for(int i=n-1;i>=0;i--){
            res[j++] = arr[i];
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna