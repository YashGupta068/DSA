class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int k = n-1;

        int res[] = new int[n];

        while(i<=j){
            if(arr[j]*arr[j] >= arr[i]*arr[i]){
                res[k--] = arr[j]*arr[j];
                j--;
            }else if(arr[j]*arr[j] < arr[i]*arr[i]){
                res[k--] = arr[i]*arr[i];
                i++;
            }
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna