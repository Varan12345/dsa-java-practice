class Solution {

    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            // same character
            if(s.charAt(left) == s.charAt(right)) {

                left++;
                right--;
            }

            // mismatch
            else {

                // remove left character
                String s1 = s.substring(left + 1, right + 1);

                // remove right character
                String s2 = s.substring(left, right);

                // check palindrome
                return isPalindrome(s1) || isPalindrome(s2);
            }
        }

        return true;
    }

    // palindrome check
    public boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
