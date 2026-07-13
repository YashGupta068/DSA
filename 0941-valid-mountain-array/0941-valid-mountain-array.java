class Solution {
    public boolean validMountainArray(int[] arr) {
        int max = arr[0];
        int maxIdx = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                maxIdx = i;
            }
        }

        for(int i=1;i<maxIdx;i++){
            if(arr[i]<= arr[i-1]){
                return false;
            }
        }

        if(maxIdx == 0 || maxIdx == arr.length-1){
            return false;
        }

        for(int i=maxIdx+1;i<arr.length;i++){ 
            if(arr[i] >= arr[i-1] ){
                return false;
            }
        }

        return true;
    }
}