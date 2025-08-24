public class Packages{
    public static void main(String[] args) {
        A obj = new A("anik");
        System.out.println(obj);
    }
}

class A{
    String name;
    A(String name){
        this.name = name;
    }
}