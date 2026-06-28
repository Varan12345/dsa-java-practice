class Solution {
    public int [] singleNumber(int[] nums) {
        int[] result = new int[2];
        int xor = 0;

        // Step 1: XOR all numbers to find the XOR of the two unique numbers
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find a set bit (rightmost set bit) in the XOR result
        int setBit = xor & -xor;

        // Step 3: Divide numbers into two groups based on the set bit
        for (int num : nums) {
            if ((num & setBit) == 0) {
                result[0] ^= num; // Group 1
            } else {
                result[1] ^= num; // Group 2
            }
        }

        return result;
    }
}
