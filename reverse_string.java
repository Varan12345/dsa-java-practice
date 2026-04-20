import java.util.Stack;

public class reverse_string {
    public static void main(String[] args) {
        String str = "Hello";
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        String s1 = "";
        while (!s.isEmpty()) {
            s1 += s.pop();
        }
          System.out.println();
        System.out.println(s1);
    }
}
//create satck using linked list
//remove consecutive duplicates [aaabcd]=[abcd]
//next greater element[4,5,2,2,25]