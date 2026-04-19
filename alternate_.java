import java.util.*;

public class alternate_ {

    static void alternateK(Queue<Integer> q, int k) {

        int n = q.size();  
        boolean reverse = true;

        while (n > 0) {

            int size = Math.min(k, n);
            int[] temp = new int[size];

           
            for (int i = 0; i < size; i++) {
                temp[i] = q.remove();
            }

            if (reverse) {
                for (int i = size - 1; i >= 0; i--) {
                    q.add(temp[i]);
                }
            } else {
                for (int i = 0; i < size; i++) {
                    q.add(temp[i]);
                }
            }

            n -= size;          
            reverse = !reverse; 
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        alternateK(q, 2);
    System.out.println(q);
        System.out.println(q);
    }
}