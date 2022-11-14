import java.util.Scanner;

public class maxElement {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i]=in.nextInt();
        max(arr,n);


    }
    static void max(int[]  arr,int n){
        int x=0;
        for(int i=0;i<n;i++){
            if (x<arr[i])
                x=arr[i];
        }
        System.out.println("The maximum element is " + x);
    }
}
