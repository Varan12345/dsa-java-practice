import java.util.Stack;

public class sort_stack {

    public static Stack<Integer> sort(Stack<Integer> s) {

        Stack<Integer> temp = new Stack<>();

        while (!s.isEmpty()) {
            int curr = s.pop();

            while (!temp.isEmpty() && temp.peek() > curr) {
                s.push(temp.pop());
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

        Stack<Integer> sorted = sort(num);

        System.out.println(sorted);
    }
}