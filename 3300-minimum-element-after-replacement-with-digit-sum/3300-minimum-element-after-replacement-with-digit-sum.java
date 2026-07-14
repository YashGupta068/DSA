class Solution {
    public int minElement(int[] arr) {
        int n = arr.length;
        int min = arr[0];

        for(int i=0;i<n;i++){
            int sum = 0;
            while(arr[i]>0){
                sum += arr[i]%10;
                arr[i]/=10;
            }
            arr[i] = sum;
        }

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }
}