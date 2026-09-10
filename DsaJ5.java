class Node{ //creation of node
    int data;  //Node data
    Node next; //Node reference
    Node prev; //Node reference


    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class LinkedList{
    Node head=null;
    void newBegin(int data){
        Node newNode=new Node(data); //creating new node
        if(head!=null){
            head=newNode; //head is now new node
            return;
        }
        newNode.next=head; //inserting value to new refere to creating link
         head.prev=newNode;
         head=newNode; //head is now new node
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print("=>"+temp.data);
            temp=temp.next;
        }
        System.out.print("=>null");
    }
    void insertLast(int data){
        if(head==null){
            newBegin(data);
                }
                else{
                    Node newNode=new Node(data);
                    Node temp=head;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next=newNode;
                    newNode.prev=temp;
                }
    }
    void insertBypos(int pos,int data){
      if(pos<0){
        System.out.println("Invalid position");
        return;
      }
      Node temp=head;
        for(int i=0;i<pos-1;i++){
             
            temp=temp.next;
        }
        Node newNode=new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.prev=temp;

      
    }
    void delteData(int data){
        Node temp=head;
        if(temp.data==data){  //its checks is first node is the data to be deleted
            head=temp.next; // make this head
            return;
        }
        while(temp.next!=null && temp.next.data!=data){ //starts traversing
            temp=temp.next;
        }
        if(temp.next==null){
           System.out.println("Data not found");
           return;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    void deleteBypos(int pos){
        if(pos<0){
            System.out.println("Invalid position");
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Position out of bounds");
            return;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    void Search(int data){
        Node temp=head;
        while(temp!=null){
          
            if(temp.data==data){
                System.out.println("Data found : "+temp.data);
                return;
            }
              temp=temp.next;
           
    }
}
}




public class DsaJ5 {
    public static void main(String[] args) {
        //DSA - Double Linked List
        LinkedList list=new LinkedList();
        list.newBegin(10);
        list.newBegin(20);
        list.newBegin(30);
        list.insertLast(40);
        list.insertBypos(2, 50);
        list.delteData(30); 
        list.deleteBypos(1);
        list.Search(10);
        list.display();
    }
    
}
