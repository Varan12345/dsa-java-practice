// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the
//  result must appear as many times as it shows in both arrays and you may return the result 
// in any order.
class Solution{
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (countMap.getOrDefault(num, 0) > 0) {
                intersection.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        // Convert the list to an array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
//    }
}