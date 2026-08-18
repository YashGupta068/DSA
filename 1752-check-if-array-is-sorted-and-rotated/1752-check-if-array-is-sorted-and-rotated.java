class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        int sorted[] = new int[n];
        
        for(int i=0;i<n;i++){
            sorted[i] = arr[i];
        }

        Arrays.sort(sorted);


        for(int start = 0;start < n ; start++){
            boolean flag = true;

            for(int i=0;i<n;i++){
                if(arr[i] != sorted[(start+i)%n]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                return true;
            }
        }

        

        return false;
            
    }
}