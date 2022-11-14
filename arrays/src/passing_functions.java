import java.util.Arrays;

public class passing_functions {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println("Before calling function");
        System.out.println(Arrays.toString(nums));
        System.out.println("After calling function");
        change(nums);
        System.out.println(Arrays.toString(nums));


    }

    static void change (int[] arr){
        arr[0]= 0;
    }


}
