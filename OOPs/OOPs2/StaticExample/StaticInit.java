public class StaticInit{

    //this is a demo to show initialization of static variables
    String nm = "sourav";
    int num = 73;
    static int a = 4;
    static int b;

    //WILL ONLY RUN ONCE, WHEN THE FIRST OBJECT IS CREATED i.e when the class is loaded for the first time
    static{
        System.out.println("I am in Static Block");
        b = a * 5;
    }

    static void display(){
        int n = 77;
        System.out.println(n);
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        StaticInit obj = new StaticInit();
        System.out.println(StaticInit.a);
        System.out.println(StaticInit.b);

        StaticInit.b += 3;

        StaticInit obj1 = new StaticInit();
        System.out.println(StaticInit.a);
        System.out.println(StaticInit.b);

    }

    static{
        System.out.println("This is 2nd Static Block");
    }
}