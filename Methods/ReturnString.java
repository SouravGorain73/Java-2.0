import java.util.Scanner;

public class ReturnString{
    public static void main(String[] args){
        // String greets = greet();
        // System.out.println(greets);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        String greet = MyGreet(name);
        System.out.println(greet);

    }

    // static String greet(){
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter Any Greetings: ");
    //     String greeting = input.nextLine();
    //     return greeting;
    // }

    static String MyGreet(String naam){
        String greetings = "Hello " + naam;
        return greetings;
    }
}