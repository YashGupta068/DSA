class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int count = 0;

        for(int i=0;i<n-1;i++){
            int curr = arr[i];
            int next = arr[i+1];

            if(curr == next){
                continue;
            }
            else if(curr!=next){
                arr[count++]=arr[i];
            }
            
        }
        arr[count++] = arr[n-1];

        return count;        
    }
}