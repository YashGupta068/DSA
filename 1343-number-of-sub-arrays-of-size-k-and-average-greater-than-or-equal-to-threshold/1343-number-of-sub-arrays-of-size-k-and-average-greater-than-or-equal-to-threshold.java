class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum / k >= threshold) {
                count++;
        }

        for (int i = 1; i <= n-k; i++) {
            sum = sum + arr[i + k - 1] - arr[i - 1];
            if (sum / k >= threshold) {
                count++;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna