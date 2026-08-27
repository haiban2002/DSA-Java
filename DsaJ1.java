public class DsaJ1 {
    public static void main(String[]args){


        //deletion of array
        int Aval[]={1,2,0,4,5,6};
        int size=Aval.length;
        int delel=2;
        if(delel<size){
        for(int i=2;i<size-1;i++){
            Aval[i]=Aval[i+1];

        }
        size--;
        for(int i=0;i<size;i++){
            System.out.println(Aval[i]);
        }
    }
        else{
            System.out.println("index is lex than size of aerray");
        }
        System.out.println("Size of Array "+size);
        
    }
    
}
