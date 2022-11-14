import java.util.Arrays;
import java.util.Scanner;

public class arraySwap {
    public static void main(String[] args) {
            int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n= in.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Array before swap");
        System.out.println(Arrays.toString(arr));
        swap(arr,n);

    }
    static void swap(int[] arr, int n){

        int i=0;
        int j=n-1;
        while(i<j){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
        }
        System.out.println("The array after swapping is:");
        System.out.println(Arrays.toString(arr));
    }
}

