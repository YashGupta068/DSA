class Solution {
    public int singleNonDuplicate(int[] arr) {
        
        int n = arr.length;
        
        if(n == 1){
            return arr[0];
        }

        int low = 0;
        int high = n-1;
        int res = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(mid == 0 && arr[0] != arr[1]){
                return arr[0];
            }

            if(mid == n-1 && arr[n-1] != arr[n-2]){
                return arr[n-1];
            }

            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                res = arr[mid];
            }

            if(mid % 2 == 0){
                if(arr[mid] == arr[mid-1]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(arr[mid-1] == arr[mid]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }

        

        return res;
    }
}