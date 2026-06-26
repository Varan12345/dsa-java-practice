class Solution{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long value = 1; // The first value in the row is always 1
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int)value);
            // Calculate the next value in the row using the formula:
            // C(n, k) = C(n, k-1) * (n - k + 1) / k
            value = value * (rowIndex - i) / (i + 1);
        }
        return row;
    }
}
