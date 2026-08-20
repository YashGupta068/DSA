class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;


        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                ans.add(key);
            }
        }

        return ans;

    }
}