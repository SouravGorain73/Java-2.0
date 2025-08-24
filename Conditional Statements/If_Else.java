import java.util.Scanner;

public class If_Else{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Salary Amount: ");
        int salary = input.nextInt();
        if(salary > 5000){
            if(salary > 20000){
                salary+=3000; // salary = salary + 3000;
            }
            else if(salary > 10000){
                salary = salary + 2000;
            }
            else{
                salary = salary + 1000;
            }
            System.out.println("Your Salary(Including Bonus) is: " + salary);
        }
        else{
            System.out.println("Invalid Salary Amount!");
        }
    }
}