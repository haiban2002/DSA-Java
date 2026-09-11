class CircularLinked<T> {

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node tail;

    CircularLinked() {
        tail = null;
    }

    void insertBeg(T data) {
        Node newNode = new Node(data);

        if (tail == null) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }
    void insertAtLast(T data){
        Node newNode=new Node(data);
          if (tail == null) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail=newNode;
        }


    }
    void deleteAtBegin(){
        if(tail==null){
            System.out.println("Empty list");
            return ;
        }
        if(tail.next==tail){
            tail=null;
            return;

        }
        else{
            tail.next=tail.next.next;
        }
    }
    void deleteAtLast(){
         if(tail==null){
            System.out.println("Empty list");
            return ;
        }
        if(tail.next==tail){
            tail=null;
            return;

        }
        else{
            Node temp=tail;
            while(tail!=temp.next){
                temp=temp.next;
            }
                       
            
            temp.next=temp.next.next;
            tail=temp;
        }

    }

    void display() {
        Node temp = tail;

        do {
            System.out.print(temp.data + " <= ");
            temp = temp.next;
        } while (temp != tail);
    }
}

public class DsaJ6 {

    public static void main(String[] args) {

        CircularLinked<Integer> list = new CircularLinked<>();

        list.insertBeg(20);
        list.insertBeg(30);
        list.insertBeg(50);
        list.insertBeg(80);

        list.display();
        System.out.println("");
        list.insertAtLast(90);
        list.display();
         System.out.println("");
        //list.deleteAtBegin();
        list.deleteAtLast();
        list.display();
    }
}