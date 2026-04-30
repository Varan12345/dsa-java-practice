

public class third_maximun {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4}; // Example array
int n = arr.length;

        if (n < 3) {
            System.out.println("There are less than three elements in the array.");
            return;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num != secondMax && num != firstMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == Integer.MIN_VALUE) {
            System.out.println("There is no third maximum value in the array.");
        } else {
            System.out.println("The third maximum value is: " + thirdMax);
        }
    }
}
        