class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<= arr[mid]){
                    high = mid - 1;
            }else{
                    low = mid + 1;
                }
            }else{
                if(arr[mid]<=target && target<= arr[high]){
                    low = mid + 1;
            }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna