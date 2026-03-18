public class reverselinklist {

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insert(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void reverse(){

        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    int find_middle(){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null&& fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow.data;
      
    }
    void merge_new_list() {
        Node temp ;
        while (head!=null){
          
        }
    }



    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){

        reverselinklist list = new reverselinklist();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        //list.find_middle();
System.out.println(list.find_middle());
        list.display();
    }
}