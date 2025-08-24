//Enhanced Switch OR Rule Switch

import java.util.Scanner;

public class CGPA_Converter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;

        while(choice != 3){
            System.out.println("CGPA <-> Percentage Converter");
            System.out.print("1. CGPA -> Percentage\n2. Percentage -> CGPA\n3. Exit\nEnter Your Choice(1-3): ");
            choice = input.nextInt();
            float cgpa, percentage;

            switch(choice){
                case 1 ->{
                    System.out.print("Enter Your CGPA: ");
                    cgpa = input.nextFloat();
                    percentage = cgpa * 9.5f;
                    System.out.println("Your Percentage is: " + percentage);
                    }
                case 2 ->{
                    System.out.print("Enter Your Percentage: ");
                    percentage = input.nextFloat();
                    cgpa = percentage / 9.5f;
                    System.out.println("Your CGPA is: " + cgpa);
                }
                case 3 ->{
                    System.out.println("Exiting...");
                }
                default -> System.out.println("Please Enter a Valid Input");
            }
        }
    }
}