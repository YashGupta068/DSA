class Solution {
    public int findMinDiff(int arr[], int m) {
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int res = Integer.MAX_VALUE;
        
        for(int i =0;i<=n-m;i++){
            res = Math.min(res,arr[i+m-1]-arr[i]);
        }
        
        return res;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna