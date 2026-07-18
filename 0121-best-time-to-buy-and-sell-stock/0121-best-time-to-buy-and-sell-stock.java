class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int mp = 0;
        int currP = 0;
        int bestBuy = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] > bestBuy){
                currP = arr[i] - bestBuy;
                mp = Math.max(mp,currP);
            }
            if(arr[i] < bestBuy){
                bestBuy = arr[i];
            }
        }

        return mp;

    }
}