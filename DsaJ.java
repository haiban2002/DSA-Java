public class DsaJ {
    public static void main(String[] args) {
        // DSA - #p1 Inserting Array element and move right
        int Arr[] = {1, 2, 3, 4, 5, 6, 0};

        int len = Arr.length;   // capacity = 7
        int size = 0;           // current elements

        for(int i = 0; i < len; i++) {
            if(Arr[i] != 0) {
                size++;
            }
        }

        int fsize = size;

        int indx = 3;
        int element = 10;

        if(size < len) {

            for(int j = size; j > indx; j--) {
                Arr[j] = Arr[j - 1];
            }

            Arr[indx] = element;
            fsize++;

            System.out.println("Array after insertion:");

            for(int i = 0; i < fsize; i++) {
                System.out.print(Arr[i] + " ");
            }

            System.out.println("\nSize = " + fsize);
            System.out.println("Capacity = " + len);

        } else {
            System.out.println("Invalid - Array is full");
        }
    }
}