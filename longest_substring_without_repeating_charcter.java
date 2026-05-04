class Solution {
     public int lengthOfLongestSubstring(String s) {

    String str="abcabcbb";
    int maxLength = 0;
    int left = 0;
    Map<Character, Integer> charIndexMap = new HashMap<>();
    for (int right = 0; right < str.length(); right++) {
        char currentChar = str.charAt(right);

        if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
            left = charIndexMap.get(currentChar) + 1;
        }

        charIndexMap.put(currentChar, right);
        maxLength = Math.max(maxLength, right - left + 1);      

     }
     return maxLength;
}

}  