public class DsaJ2 {
    public static void main(String[] args) {

        //DSA searching Array
        int Array[]={10,20,210,40,50};
        int size=Array.length;
        int checkEl=210;
        for(int i=0;i<size-1;i++){
            if(Array[i]==210){
                System.out.println("Array value 210 found in index : "+i);
            }
        }
    }
    
}
