class DynamicArray{
    int Ar[];
  int size;
  int capacty;


    DynamicArray(int capacity){
        Ar=new int[capacity];
        this.capacty=capacity;
        size=0;

    }
    boolean insert(int index,int element){
        if(index<0 ||index>size){ // without resize we can include (size>=capacity)
            System.out.println("invalid index");
            return false;
        }
        else if(size>=capacty){ //if size is full 
              resize();
        }
        for(int i=size;i>index;i--){
            Ar[i]=Ar[i-1];
        }
        Ar[index]=element;
        size++;
        return true;
    }

    int get(int index){
        
        return Ar[index];
    }
    void set(int index,int element){
          
        Ar[index]=element;
    }

        void display(){
        for(int i=0;i<size;i++){
            System.out.println(Ar[i]);
        }
    }
    int serach(int element){
        for(int i=0;i<size;i++){
           if(Ar[i]==element){
            return i;
           }
           
        }
        size--;
        return 0;
    }
    boolean delete(int index){
        for(int i=index;i<size-1;i++){
            Ar[i]=Ar[i+1];
            return true;
        }
        return false;
    }
    void resize(){
        capacty=capacty*2;
        int newArray[]=new int[capacty];
        for(int i=0;i<size;i++){
            newArray[i]=Ar[i];
        }
        Ar=newArray;  //again we insert element into old array after increament

    }

}

public class Dyna {
    public static void main(String[] args) {


        // DSA - Dynamic Array
               DynamicArray a=new DynamicArray(3);

      a.insert(0, 21);
       a.insert(1,23);
       a.insert(2,30);
       a.insert(3, 45);  
       a.set(2,2002);  //setting array
        a.display();
           System.out.println(a.get(0));    //geting array
        System.out.println("index of 2002 is "+a.serach(2002));   //seraching element
       System.out.println(a.delete(0));
       System.out.println(a.get(0));
       //after dynamic array increasses size 
       System.out.println("dynamic array size after increament size"+a.capacty);
    }
    
}
