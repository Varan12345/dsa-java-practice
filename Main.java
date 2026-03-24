import java.util.Stack;

public class Main {

    static void nextgreaterele(int arr[]) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

           
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(stack.peek() + " ");
            }

            
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 4, 3};
        nextgreaterele(arr);
    }
}
// import java.util.*;

// public class stack_arr {
//     public static void main(String[] args) {

//         int[] arr = {2, 1, 2, 4, 3};
//         int n = arr.length;

//         int[] result = new int[n];

//         for (int i = 0; i < n; i++) {

//             result[i] = -1; // default

//             for (int j = i + 1; j < n; j++) {

//                 if (arr[j] > arr[i]) {
//                     result[i] = arr[j];
//                     break; // stop at first greater element
//                 }
//             }
//         }

//         System.out.println(Arrays.toString(result));
//     }
//}