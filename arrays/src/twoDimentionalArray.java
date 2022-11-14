import java.util.Scanner;

public class twoDimentionalArray {
    public static void main(String[] args) {

        System.out.println("Enter the size of the array");
        int n ;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int [][] array = new int[n][n];

        for(int i=0;i<n;i++)                                // <-- getting array input
            for(int j=0;j<n;j++)
                array[i][j]=in.nextInt();

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]+ " ");             //<-- printing the 2d matrix
            }
            System.out.println();
        }








    }
}
