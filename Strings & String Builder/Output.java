
import java.util.Arrays;

public class Output{
    public static void main(String[] args) {
        // System.out.println(56);
        // System.out.println("Sourav");
        System.out.println(new int[] {32, 56, 78, 89});

        System.out.println(Arrays.toString(new int[]{32, 56, 78, 89}));     //Method overiding by calling .toString method of Arrays that overides the default one inside the println method

        // String name = null;
        // System.out.println(name);
    }
}