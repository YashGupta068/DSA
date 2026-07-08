class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int count = 0;
        Arrays.sort(arr);
        
        int i = 0;
        int j = arr.length-1;

        while(i<=j){
            if(arr[i]+arr[j] <= limit){
                i++;
            }

            count++;
            j--;
        }
        
        return count;
    }
}