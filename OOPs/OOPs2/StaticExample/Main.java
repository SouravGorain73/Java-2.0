public class Main{
    public static void main(String[] args) {
        // Human kunal = new Human("Kunal", 23, 10000, false);
        // Human rahul = new Human("Rahul", 24, 15000, true);
        // Human arpit = new Human("Arpit", 25, 20000, false);

        // System.out.println(Human.population);   //No need to create any objects for using a static variables
        // System.out.println(Human.population); //Same for every object of the class
        Main obj = new Main();
        obj.greeting();
    }

    void greeting(){
        namaste();
        System.out.println("Lawda Greet kare tumko...");
    }

    static void namaste(){
        System.out.println("Maa Chudao...");
    }
}