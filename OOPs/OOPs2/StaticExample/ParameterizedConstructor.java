public class ParameterizedConstructor{
    int age = 21;
    String name;
    public ParameterizedConstructor(String name) {
        this.name = name;
        System.out.println(name);
    }

    void display(){
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("SOURAV");
        obj.display();
    }
}