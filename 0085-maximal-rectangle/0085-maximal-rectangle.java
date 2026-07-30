class Solution {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;

        for (int i = 0; i <= heights.length; i++) {
            while (!st.isEmpty() && (i == heights.length || heights[st.peek()] >= heights[i])) {
                int h = heights[st.pop()];
                int w;

                if (st.isEmpty())
                    w = i;
                else
                    w = i - st.peek() - 1;

                max = Math.max(max, h * w);
            }
            st.push(i);
        }

        return max;
    }

    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0)
            return 0;

        int n = matrix.length;
        int m = matrix[0].length;

        int[] histogram = new int[m];

        // First row
        for (int i = 0; i < m; i++) {
            histogram[i] = matrix[0][i] - '0';
        }

        int maxAns = largestRectangleArea(histogram);

        // Remaining rows
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0')
                    histogram[j] = 0;
                else
                    histogram[j] += 1;
            }

            maxAns = Math.max(maxAns, largestRectangleArea(histogram));
        }

        return maxAns;
    }
}