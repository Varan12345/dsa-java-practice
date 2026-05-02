package dsa;

public class k_beauty_of _the_number {
    int [] divisor;
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int count = 0;

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            int value = Integer.parseInt(substring);

            if (value != 0 && num % value == 0) {
                count++;
            }
        }

        return count;
    }
}
