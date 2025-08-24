import java.util.ArrayList;

public class Basic{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        
        //Inserting Elements
        list.add(5);
        list.add(23);
        list.add(37);
        list.add(53);
        list.add(65);

        //Printing the List
        System.out.println(list);

        //Accessing a Single Element
        System.out.println(list.get(3));
        
        //Adding elements in partyicular indices
        list.add(1, 71);

        //Printing the List
        System.out.println(list);

        //Updating Element in List
        list.set(2, 999);

        System.out.println(list);

        System.out.println(list.get(1));

        //Removing Element from the list
        list.remove(1);

        System.out.println(list.get(1));

        System.out.println(list);
        // System.out.println(list.get(8));

        //Searching an element in the ArrayList
        System.out.println(list.contains(73));      //Return false as it does not contains 73

        System.out.println(list.contains(71));      //Return true as it contains 71 in the list
    }
}