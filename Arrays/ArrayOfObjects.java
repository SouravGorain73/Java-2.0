import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Elements You Want to Enter: ");
        int n = input.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th element: ");
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));
    }
}