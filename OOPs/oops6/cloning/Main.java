public class Main{
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(23, "Kunal");
        // Human twin = new Human(kunal);

        // System.out.println(twin.age);
        // System.out.println(twin.name);


        Human twin = (Human)kunal.clone();      //Shallow Copy

        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(twin.arr);
        System.out.println(kunal.arr);


    }
}