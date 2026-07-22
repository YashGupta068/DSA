class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int i = 0;
        int j = 1;

        while(j<n){
            if(arr[i]==arr[j]){
                i+=2;
                j+=2;
            }else{
                return arr[i];
            }
            
        }



        return arr[n-1];
    }
}