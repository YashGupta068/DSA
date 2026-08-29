class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        
        int sum = 0;
        
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        int max = sum;
        
        for(int i=1;i<n-k+1;i++){
            sum = sum - arr[i-1] + arr[i+k-1];
            
            max = Math.max(sum,max);
        }
        
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna