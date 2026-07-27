class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int mp = 0;
        int bestB = arr[0];
        int currP = 0;

        for(int i = 1;i<n;i++){
            if(arr[i]> bestB){
                currP = arr[i] - bestB;
                mp = Math.max(currP,mp);
            }else{
                bestB = arr[i];
            }
        }

        return mp;
    }
}