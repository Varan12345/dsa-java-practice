// You are a product manager and currently leading a team to develop a new product. Unfortunately, 
// the latest version of your product fails the quality check. Since each version is developed based 
// on the previous version, all the versions after a bad version are also bad
class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1; 
            }
        }

        return left;
       //
    }
}