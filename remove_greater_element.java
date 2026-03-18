import java.util.Stack;

public class remove_greater_element {

    public static Stack<Integer> removeGreater(Stack<Integer> s) {

        Stack<Integer> temp = new Stack<>();

        while (!s.isEmpty()) {
            int curr = s.pop();

            while (!temp.isEmpty() && temp.peek() < curr) {
                temp.pop();
            }

            temp.push(curr);
        }

        return temp;
    }

    public static void main(String[] args) {

        Stack<Integer> num = new Stack<>();

        num.push(10);
        num.push(9);
        num.push(99);
        num.push(13);
        num.push(11);
        num.push(3);

        Stack<Integer> result = removeGreater(num);

        System.out.println(result);
    }
}