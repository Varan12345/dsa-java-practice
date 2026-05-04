class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 occurring once

        for (int num : nums) {
            sum += num;
            int mod = ((sum % k) + k) % k; // Handle negative sums

            if (map.containsKey(mod)) {
                count += map.get(mod); // Add the count of previous occurrences
            }

            map.put(mod, map.getOrDefault(mod, 0) + 1); // Update the count for this mod
        }

        return count;
    }
}