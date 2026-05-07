class reverse_vowels_of_string {

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            // left vowel find
            while(left < right &&
                 "aeiouAEIOU".indexOf(arr[left]) == -1) {

                left++;
            }

            // right vowel find
            while(left < right &&
                 "aeiouAEIOU".indexOf(arr[right]) == -1) {

                right--;
            }

            // swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(arr);
    }
}
