import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.print("Enter Operation You want to Perform(+, -, *, /, % and  x or X for Exiting): ");
            char ch = (char) input.next().trim().charAt(0);
            float result = 0;
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.println("....Performing " + ch + " Operation....");
                System.out.print("Enter First Number: ");
                float num1 = input.nextFloat();
                System.out.print("Enter Second Number: ");
                float num2 = input.nextFloat();

                if(ch == '+'){
                    result = num1 + num2;
                }
                else if(ch == '-'){
                    result = num1 - num2;
                }
                else if(ch == '*'){
                    result = num1 * num2;
                }
                else if(ch == '/'){
                    if(num2 == 0){
                        System.out.println("Can't Divided by Zero!");
                    }
                    else{
                      result = num1 / num2;  
                    }
                }
                else if(ch == '%'){
                    result = num1 % num2;
                }
                if(ch == '/' && num2 != 0 || ch != '/'){
                    System.out.println("....Solution....");
                    System.out.println(num1 + " " + ch + " " + num2 + " = " + result);
                }
            }
            else if(ch == 'x' || ch == 'X'){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid Operator!");
            }
        }
    }
}