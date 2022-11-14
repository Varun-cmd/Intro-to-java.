import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;

public class dynamic_arrays {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int n;
        System.out.println("Enter the size of the array");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        for (int i=0;i<n;i++)
                list.add(in.nextInt());                             // <-- getting input from the user
        System.out.println(list);


        ArrayList<ArrayList<Integer>> array = new ArrayList<>();

            for (int i=0;i<3;i++)
                    array.add(new ArrayList<>());               // <- initialize 2d array before using it

        for (int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                    array.get(i).add(in.nextInt());                 //<-- getting input form user      (2d matrix)

    }
}
