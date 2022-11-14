import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] arr = new int[5];

            // input using for loop

        System.out.println("Enter the array elements");
            for (int i=0;i<arr.length;i++){
                arr[i] = in.nextInt();
            }

        System.out.println("Printed using for loop");                       //<--- for-loop
            for( int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
        System.out.println("\nPrinted using for each loop");                  // <--  for-Each loop
            for(int num: arr){
                System.out.print(num +" ");
            }

        System.out.println("printed using toString function");
        System.out.println(Arrays.toString(arr));                           // <-- to-String method


        System.out.println("Enter the String array elements");
        String[] str = new String[4];

        for (int i=0;i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));







    }
}
