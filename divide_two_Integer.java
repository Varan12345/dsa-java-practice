class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Handle overflow case
        }

        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);
        long quotient = 0;

        while (dividendL >= divisorL) {
            long temp = divisorL, multiple = 1;
            while (dividendL >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dividendL -= temp;
            quotient += multiple;
        }

        return (dividend > 0) == (divisor > 0) ? (int) quotient : -(int) quotient;
       //
    }
}
