
import java.util.Arrays;

public class Methods{
    public static void main(String[] args){
        // String name1 = new String("Sourav");
        // String name2 = new String("Sourav");

        // System.out.println(name1 == name2);

        // System.out.println(name1.equals(name2));       //Just checking the values of name1 and name2


        // String a = "hello";
        // String b = "hello";

        // String c = a;
        // System.out.println(b == c);

        
        String name = "Sourav Gorain";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());


        String name1 = "    Sourav    ";
        System.out.println(name1);
        System.out.println(name1.strip());

        String name2 = "Hey this is Sourav Gorain";
        System.out.println(Arrays.toString(name2.split("i")));      //Cut and removed the passing parameter and return as a array 
    }
}