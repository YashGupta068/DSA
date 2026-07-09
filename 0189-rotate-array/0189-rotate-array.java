class Solution {
    public void rotate(int[] arr, int k) {
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        k %= n;
        for(int i=n-k;i<n;i++){
            st.push(arr[i]);;
        }
        
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }


        for(int i=k-1;i>=0;i--){
            int a = st.pop();
            arr[i] = a;
        }       

    }
}