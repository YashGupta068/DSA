class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=1;i<n-1;i++){
            int prev = nums[i-1];
            int next = nums[i+1];

            if(prev == next){
                return false;
            }

        }

        return true;
    }
}