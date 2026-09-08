class Node{ //creation of node
    int data;  //Node data
    Node reference; //Node reference


    Node(int data){
        this.data=data;
        this.reference=null;
    }
}
class LinkedList1{
    Node head=null;
    void newBegin(int data){
        Node newNode=new Node(data); //creating new node
        newNode.reference=head; //inserting value to new refere
 //to creating link
         head=newNode; //head is now new node
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print("=>"+temp.data);
            temp=temp.reference;
        }
        System.out.print("=>null");
    }
    void reverse(){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.reference;
            current.reference=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
   
   
   
}





public class DsaJ4 {
    public static void main(String[] args) {
        //DSA - Reverse Linked List
        LinkedList1 list1=new LinkedList1();
        list1.newBegin(10);
        list1.newBegin(20);
        list1.newBegin(30);
        list1.display();
        System.out.println();
        list1.reverse();
        list1.display();
    }
    
}
