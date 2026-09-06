class Node{ //creation of node
    int data;  //Node data
    Node reference; //Node reference


    Node(int data){
        this.data=data;
        this.reference=null;
    }
}
class LinkedList{
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
    void insertLast(int data){
        if(head==null){
            newBegin(data);
                }
                else{
                    Node newNode=new Node(data);
                    Node temp=head;
                    while(temp.reference!=null){
                        temp=temp.reference;
                    }
                    temp.reference=newNode;
                }
    }
    void insertBypos(int pos,int data){
      if(pos<0){
        System.out.println("Invalid position");
        return;
      }
      Node temp=head;
        for(int i=0;i<pos-1;i++){
            
            temp=temp.reference;
        }
        Node newNode=new Node(data);
        newNode.reference=temp.reference;
        temp.reference=newNode;

      
    }
    void delteData(int data){
        Node temp=head;
        if(temp.data==data){  //its checks that head data is data to delete
            head=temp.reference; // make this head
            return;
        }
        while(temp.reference!=null && temp.reference.data!=data){ //starts traversing
            temp=temp.reference;
        }
        if(temp.reference==null){
           System.out.println("Data not found");
           return;
        }
        temp.reference=temp.reference.reference;
    }
    void deleteBypos(int pos){
        if(pos<0){
            System.out.println("Invalid position");
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.reference;
        }
        if(temp.reference==null){
            System.out.println("Position out of bounds");
            return;
        }
        temp.reference=temp.reference.reference;
    }
    void Search(int data){
        Node temp=head;
        while(temp!=null){
          
            if(temp.data==data){
                System.out.println("Data found : "+temp.data);
                return;
            }
              temp=temp.reference;
           
    }
}
}




public class DsaJ3 {
    public static void main(String[] args) {
        //DSA - Linked List
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
