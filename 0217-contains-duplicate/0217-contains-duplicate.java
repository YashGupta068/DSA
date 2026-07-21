class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int  i = 0;

        while(i<n && !set.contains(nums[i])){
            set.add(nums[i]);
            i++;
        }

        if(set.size()!= n){
            return true;
        }
        return false;
    }
}