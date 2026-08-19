class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int count = 0;
        int candidate = 0;

        for(int i=0;i<n;i++){
            if(count == 0){
                candidate = arr[i];
            }

            if(candidate == arr[i]){
                count++;
            }else{
                count--;
            }
        }

        return candidate;
    }
}