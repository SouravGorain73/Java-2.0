import java.util.Arrays;

public class StoringRollNo{
    public static void main(String[] args) {
        //Store a roll no
        int a = 21;

        //Store a student's name
        String name = "Rohit Sharma";

        //Array Systax
        // datatype[] variable_name = new datatype[size];

        int[] roll1 = new int[5];

        int[] roll2 = {32, 65, 24, 58};

        int roll3[] = {32, 65, 24, 58};

        int[] roll;     //declaration of array. here roll is getting defined on the stack.
        roll = new int[5];  //initialization : Here the actual object is being created in the heap memory

        System.out.println(Arrays.toString(roll));

        String[] arr = new String[4];
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[4]);     // Array Index Out of Bound Exception(as array arr has only 4 elements till index 3(0, 1, 2, 3))
    }
}