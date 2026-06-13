import java.util.*;

class Solution {

    public List<String> invalidTransactions(String[] transactions) {

        int n = transactions.length;
        boolean[] invalid = new boolean[n];

        String[] names = new String[n];
        int[] times = new int[n];
        int[] amounts = new int[n];
        String[] cities = new String[n];

        for (int i = 0; i < n; i++) {
            String[] parts = transactions[i].split(",");

            names[i] = parts[0];
            times[i] = Integer.parseInt(parts[1]);
            amounts[i] = Integer.parseInt(parts[2]);
            cities[i] = parts[3];

            if (amounts[i] > 1000) {
                invalid[i] = true;
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (names[i].equals(names[j])
                        && !cities[i].equals(cities[j])
                        && Math.abs(times[i] - times[j]) <= 60) {

                    invalid[i] = true;
                    invalid[j] = true;
                }
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (invalid[i]) {
                result.add(transactions[i]);
            }
        }

        return result;
        //
    }
}