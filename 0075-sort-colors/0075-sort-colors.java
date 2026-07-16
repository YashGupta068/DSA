class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int count[] = new int[3];

        for (int num : arr) {
            count[num]++;
        }


        int j = 0;

        while(count[0]-->0){
            arr[j++] = 0;
        }
        while(count[1]-->0){
            arr[j++] = 1;
        }
        while(count[2]-->0){
            arr[j++] = 2;
        }
    }
}