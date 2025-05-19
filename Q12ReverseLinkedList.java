// Node class
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
public class Q12ReverseLinkedList {
    Node head;


    public void reverseTheList(){
         if(head==null) return ;

        Node i = head;
        Node j =head;
        while (j.next != null ){
            j=j.next;
        }
        if( i==j) return ;

        while (head != j){
            head=head.next;
            i.next=j.next;
            j.next=i;
            i=head;

        }
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        Q12ReverseLinkedList list = new Q12ReverseLinkedList();

        list.reverseTheList();

    }
}
