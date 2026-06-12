class Solution {
    public int [] beautifulArray(int n) {
        if (n == 1) {
            return new int[]{1};
        }

        int[] odd = beautifulArray((n + 1) / 2);
        int[] even = beautifulArray(n / 2);

        int[] result = new int[n];
        int index = 0;

        for (int num : odd) {
            result[index++] = num * 2 - 1;
        }

        for (int num : even) {
            result[index++] = num * 2;
        }

        return result;
       //System.out.println("Hello World");
    }
}
