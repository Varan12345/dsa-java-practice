public class Largest_triangle_area {
    public static void main(String[] args) {
        int[][] points = {{0, 0}, {0, 1}, {1, 0}};
        double maxArea = 0.0;
        int n = points.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = 0.5 * Math.abs(points[i][0] * (points[j][1] - points[k][1]) +
                            points[j][0] * (points[k][1] - points[i][1]) +
                            points[k][0] * (points[i][1] - points[j][1]));
                    maxArea = Math.max(maxArea, area);
                }
            }}