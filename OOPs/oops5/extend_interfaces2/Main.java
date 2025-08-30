public class Main implements A, B{
    @Override
    public void greet(){

    }
    
    public static void main(String[] args) {
        System.out.println("Hello");
        Main obj = new Main();
        obj.fun();
        obj.greet();
        A.greeting();
    }

}