class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int[] count = new int[2];

        // Count student preferences
        for (int student : students) {
            count[student]++;
        }

        // Process sandwiches from top
        for (int sandwich : sandwiches) {

            if (count[sandwich] == 0) {
                return count[0] + count[1];
            }

            count[sandwich]--;
        }

        return 0;
    }
}