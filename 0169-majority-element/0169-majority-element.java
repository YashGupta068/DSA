class Solution {
    public int majorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        for(int i=0;i<arr.length;i++){
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