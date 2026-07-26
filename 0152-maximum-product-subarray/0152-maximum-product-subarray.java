class Solution {
    public int maxProduct(int[] nums) {
        int suffix = 1;
        int prefix = 1;
        int res = nums[0];

        for(int i=0;i<nums.length;i++){
            if(suffix == 0){
                suffix = 1;
            }

            if(prefix == 0){
                prefix = 1;
            }

            suffix*=nums[nums.length-i-1];
            prefix*=nums[i];

            res = Math.max(res,Math.max(prefix,suffix));

        }

        return res;
    }
}