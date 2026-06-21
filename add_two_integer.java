class Solution{
    public int sum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; // Calculate carry
            a = a ^ b; // Sum without carry
            b = carry; // Update b to carry for next iteration
        }
        return a; // Final sum is stored in a//
    }
}