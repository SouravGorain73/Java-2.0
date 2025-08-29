abstract public class Parent{
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("Hello Bhai");
    }

    static{
        System.out.println("First");
    }

    abstract  void career();
    abstract  void partner();
}