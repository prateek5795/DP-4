//  Time Complexity: O(mn)
//  Space Complexity: O(mn)

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int max = 0;
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i < dp.length; ++i) {
            for (int j = 1; j < dp[0].length; ++j) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max*max;
    }
}
