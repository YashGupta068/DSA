class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        int n = nums.length;
        for(int i= 0;i<n;i++){
            if(nums[i] != 0){
                count++;
                if(maxCount < count){
                    maxCount = count;
                }
            }else if(nums[i] == 0){
                count = 0;
            }
        }

        return maxCount;
    }
}