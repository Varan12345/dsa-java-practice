public class ain {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        int result = strStr(haystack, needle);
        System.out.println(result);  // Output: -1
    }
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
        //  th
            if (j == m) {
                return i;
            }
        }
System.out.println();
        return -1;
    }
}