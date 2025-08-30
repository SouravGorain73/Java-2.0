public interface A{

    //Static intyerface methods always should have a body
    static void greeting(){
        System.out.println("It is a static method");
    }
    default void fun(){
        System.out.println("I am in A");
    }
}