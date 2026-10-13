class Solution {
    public int sumOfSquares(int[] arr) {
        int n = arr.length;
        int ans = 0;

        for(int i=1;i<=n;i++){
            if(n % i == 0){
                ans+=arr[i-1]*arr[i-1];
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna