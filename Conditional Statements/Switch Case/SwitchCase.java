import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter the name of the fruit: ");
        // String fruit = input.next();

        // if(fruit.equals("mango")){
        //     System.out.println("King of Fruits");
        // }
        // else if(fruit.equals("banana")){
        //     System.out.println("Fav Fruit");
        // }
        // else{
        //     System.out.println("Invalid Input!");
        // }

        // switch(fruit){
        //     case "mango":
        //         System.out.println("King of Fruits");
        //         break;
        //     case "banana":
        //         System.out.println("Fav Fruit");
        //         break;
        //     case "guava":
        //         System.out.println("Healthy Fruit");
        //         break;
        //     case "grapes":
        //         System.out.println("Small Fruit");
        //         break;
        //     default:
        //         System.out.println("Invalid Input!");
        //         break;
        // }

        // switch(fruit){
        //     case "mango" -> System.out.println("King of Fruits");
        //     case "banana" -> System.out.println("Fav Fruit");
        //     case "guava" -> System.out.println("Healthy Fruit");
        //     case "grapes" -> System.out.println("Small Fruit");
        //     default -> System.out.println("Invalid Input!");
        // }

        System.out.print("Enter the number of Day(1-7): ");
        int day = input.nextInt();

        // switch (day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Satarday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Invalid Input!");
        // }

        switch(day){                                                        // No Need to Use the Break Statment Here
            case 1, 2, 3, 4, 5 -> System.out.println("Working Day");
            case 6,7 -> System.out.println("Weekend Days");
            default -> System.out.println("Invalid Input!");
        }

    }
}