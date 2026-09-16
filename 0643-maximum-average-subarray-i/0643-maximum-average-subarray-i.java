class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n = arr.length;

        int result = 0;
        int sum = 0;

        for(int i=0;i<k;i++){
            sum += arr[i];
        }

        result = sum;
        for(int i=1;i<=n-k;i++){
            sum = (sum - arr[i-1] + arr[i+k-1]);
            result = Math.max(result,sum);
        }

        return (double)result/k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna