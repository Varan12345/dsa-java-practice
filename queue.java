import java.util.*;

public class queue{

    static void reverseK(Queue<Integer> q, int k) {

        if (q.isEmpty() || k > q.size()) return;

        Stack<Integer> stack = new Stack<>();

        
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }

        
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

    
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseK(q, 3);

        System.out.println(q);
    }
}