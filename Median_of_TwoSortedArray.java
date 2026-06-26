class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;

        if (totalLength % 2 == 1) {
            return findKth(nums1, 0, nums2, 0, totalLength / 2 + 1);
        } else {
            double leftMedian = findKth(nums1, 0, nums2, 0, totalLength / 2);
            double rightMedian = findKth(nums1, 0, nums2, 0, totalLength / 2 + 1);
            return (leftMedian + rightMedian) / 2.0;
        }
    }
}