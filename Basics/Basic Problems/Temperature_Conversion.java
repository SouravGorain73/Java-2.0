import java.util.Scanner;

public class Temperature_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temp in Celcius: ");
        float Ctemp = input.nextFloat();
        float Ftemp = (Ctemp * 9/5) + 32;
        System.out.println("The Temperature in F0ahrenheit: " + Ftemp);
    }
}