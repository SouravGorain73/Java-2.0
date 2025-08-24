import java.util.Arrays;

public class Swap{
    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);


        // System.out.print("Enter Value of a: ");
        // int a = input.nextInt();
        // System.out.print("Enter Value of b: ");
        // int b = input.nextInt();
        // System.out.println("Values Before Swapping: a = " + a + " and b = " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("Values After Swapping: a = " + a + " and b = " + b);


        //Pass by Value Only(Primitives)

        // System.out.print("Enter Value of a: ");
        // int a = input.nextInt();
        // System.out.print("Enter Value of b: ");
        // int b = input.nextInt();
        // System.out.println("Values Before Swapping: a = " + a + " and b = " + b);
        
        // swapping(a, b);
        // System.out.println("Values After Swapping: a = " + a + " and b = " + b);


        //Create an array
        int arr[] ={4, 7, 2, 9};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    // static void swapping(int num1, int num2){       //No Changes happen
    //         int temp = num1;
    //         num1 = num2;
    //         num2 = temp;
    // }


    //Pass by Value of Reference Variable(Objects)
    static void change(int nums[]){
        nums[0] = 73;
    }


}