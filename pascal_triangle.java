class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // First element of every row is 1

            for (int j = 1; j < i; j++) {
                // Each element is the sum of the two elements directly above it
                int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(val);
            }

            if (i > 0) {
                row.add(1); // Last element of every row is 1
            }

            triangle.add(row);
        }

        return triangle;
        //

}
