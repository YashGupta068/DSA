class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        int idx = 0;

        if(nums.length == 0){
            return res;
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                res[0] = i;
                res[1] = i;
                idx = i;
                break;
            }
        }


        for(int i = idx+1; i<nums.length;i++){
            if(nums[i] == target){
                res[1] = i;
            }
        }
        
        return res;
    }
}