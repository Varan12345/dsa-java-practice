public class linked_list {

    class Node {
        int data;
        Node next;
        int k;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // insert at start
    void insert_at_start(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            return;
        }

        new_node.next = head;
        head = new_node;
    }

    void del_ate_position(){
       
        Node temp=head;
        head=head.next;
      temp.next=null;
    }

    void insert_at_position(int data,int k){
   Node new_node=new Node(data);
   if (k==1){
        insert_at_start(data);
   }
   Node temp=head;
   for (int i=1;i<k-1;i++){
    temp=temp.next;
   }
   new_node.next=temp.next;
   temp.next=new_node;
    }
    void delete(){
        Node temp=head;
       while (temp.next!=null){
        temp=temp.next;
        temp.next=null;
       }
    }

    // insert at end
    void insert_at_end(int data) {

        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new_node;
    }


    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        linked_list list = new linked_list();

        list.insert_at_start(10);
        list.insert_at_start(20);
        
        
       
        list.insert_at_start(30);
    list.insert_at_end(40);
         list.insert_at_end(50);

        list.insert_at_position(15,3);
        list.del_ate_position();
        list.delete();

        list.display();
    }
}
//find middle element of the ll
//find  reverse the link list
//detect if the given link list have cycle present or  not 