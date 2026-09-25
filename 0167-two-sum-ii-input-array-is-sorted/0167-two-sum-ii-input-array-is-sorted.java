class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;

        int res[] = new int[2];

        int i = 0;
        int j = n - 1;

        while(i<j){
            if(arr[i] + arr[j] > target){
                j--;
            }
            if(arr[i] + arr[j] < target){
                i++;
            }
            if(arr[i] + arr[j] == target){
                res[0] = ++i;
                res[1] = ++j;
                break;
            }
        }
        
        return res;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna