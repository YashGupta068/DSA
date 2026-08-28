class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        
        int n = arr.length;
        
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<k;i++){
            if(arr[i] < 0){
                q.offer(arr[i]);
            }
        }
        
        if(q.isEmpty()){
            list.add(0);
        }else{
            list.add(q.peek());
        }
        
        for(int i=1;i<=n-k;i++){
            if(arr[i-1] < 0){
                q.poll();
            }
            
            if(arr[i+k-1] < 0){
                q.offer(arr[i+k-1]);
            }
            
            if(q.isEmpty()){
                list.add(0);
            }else{
                list.add(q.peek());
            }
            
        }
        
        return list;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna