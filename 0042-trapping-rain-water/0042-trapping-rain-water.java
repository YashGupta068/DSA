class Solution {
    public int trap(int[] arr) {
        int n = arr.length;

        int ans = 0;

        int left = 0;
        int right = 0;

        int  l = 0;
        int r = n-1;

        while(l<r){
            left = Math.max(left,arr[l]);
            right = Math.max(right,arr[r]);

            if(left > right){
                ans+= right - arr[r];
                r--;
            }else{
                ans+= left - arr[l];
                l++;
            }
        }

        return ans;
    }
}