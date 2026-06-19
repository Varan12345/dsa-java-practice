class Solution {
    public int maxcount(int n, int[][] ops) {
        if (ops.length == 0) {
            return n * n;
        }
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        for (int[] op : ops) {
            minA = Math.min(minA, op[0]);
            minB = Math.min(minB, op[1]);
        }
        return minA * minB;
        //
    }
}