class Solution{
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num; // Update minimum
            }
            if (num > max) {
                max = num; // Update maximum
            }
        }

        return gcd(min, max); // Return the GCD of the minimum and maximum
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}