import java.util.ArrayList;
import java.util.Scanner;

public class MultiArraylist{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // ArrayList of ArrayList of Integers

        //Initialising
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());    //adding 3 arraylist
        }

        //adding elements

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(input.nextInt());
            }
        }

        //Printing the arraylist of arraylist
        System.out.println(list);

    }
}