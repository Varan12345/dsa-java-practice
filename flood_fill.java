class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }
        dfs(image, sr, sc, oldColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int oldColor, int newColor) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != oldColor) {
            return;
        }
        image[row][col] = newColor;
        dfs(image, row - 1, col, oldColor, newColor); // up
        dfs(image, row + 1, col, oldColor, newColor); // down
        dfs(image, row, col - 1, oldColor, newColor); // left
        dfs(image, row, col + 1, oldColor, newColor); // right
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        int[][] result = solution.floodFill(image, sr, sc, newColor);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
