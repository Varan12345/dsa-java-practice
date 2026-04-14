//wap whicg wil check if the given stack is palindrome or not
import java.util.Stack;

public class planindrome_stack{
    public static boolean isplaindrome(Stack<Integer>st){
        
        Stack  <Integer>temp=new Stack();
        for (int x:st){
            temp.push(x);
        }
    for(int x:st){
        if(x!=temp.pop()){
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args){
   Stack <Integer> st=new Stack();
            st.push(5);
            st.push(4);
            st.push(3);
            st.push(4);
            st.push(5);

 if (isplaindrome(st)) System.out.println("Its palindrome");
 else System.out.println("its not palindrome");
    }}