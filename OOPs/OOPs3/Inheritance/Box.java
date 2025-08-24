public class Box{
    private double l;
    double h;
    double w;
    private int age;


    static void greeting(){     //Static Method can't be overridden
        System.out.println("I am in Box Class -> Greeting Method");
    }

    public double getL(){
        return l;
    }

    Box(){
        this.h = -69;
        this.l = 777;
        this.w = -1;
    }

    //CUBE
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = 444;
    }

    public Box(double l, double h, double w, int age) {
        this.l = l;
        this.h = h;
        this.w = 444;
        this.age = 21;
    }

    //Copy Constructor
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void displayInfo(){
        System.out.println("Running the box");
    }
}