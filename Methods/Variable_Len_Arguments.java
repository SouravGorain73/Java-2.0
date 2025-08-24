import java.util.Arrays;

public class Variable_Len_Arguments{
    public static void main(String[] args){
        // fun(2, 4, 7, 12, 56);       //taking variable length arguments

        multiple(2, 3, "Sourav Gorain", "hii", "Hello");
    }

    static void multiple(int a, int b, String ...arr){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(arr));
    }

    // static void fun(int ...v){      //taking array of integers(given int)
    //     System.out.println(Arrays.toString(v));
    // }
}