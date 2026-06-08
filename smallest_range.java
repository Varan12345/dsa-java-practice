class Solution{
    public int smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(nums.get(a[0]).get(a[1]), nums.get(b[0]).get(b[1])));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            minHeap.offer(new int[]{i, 0});
            max = Math.max(max, nums.get(i).get(0));
        }
        int rangeStart = 0, rangeEnd = Integer.MAX_VALUE;
        while (minHeap.size() == nums.size()) {
            int[] min = minHeap.poll();
            int minValue = nums.get(min[0]).get(min[1]);
            if (max - minValue < rangeEnd - rangeStart) {
                rangeStart = minValue;
                rangeEnd = max;
            }
            if (min[1] + 1 < nums.get(min[0]).size()) {
                minHeap.offer(new int[]{min[0], min[1] + 1});
                max = Math.max(max, nums.get(min[0]).get(min[1] + 1));
            }
        }
        return new int[]{rangeStart, rangeEnd};
    }
}