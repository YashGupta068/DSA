class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length - 1;

        // Put all 0s at the beginning
        int i = 0;
        int j = 1;

        while (j <= n) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if (arr[i] == 0) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }

        // Put all 1s after the 0s
        int k = i;
        j = i + 1;

        while (j <= n && k <= n) {
            if (arr[k] != 1 && arr[j] == 1) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k++;
                j++;
            }
            else if (arr[k] == 1) {
                k++;
                j++;
            }
            else {
                j++;
            }
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna