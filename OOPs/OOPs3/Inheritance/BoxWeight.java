public class BoxWeight extends Box{
    double weight;

    // @Override
    static void greeting(){
        System.out.println("I am in Box Weight Class -> Greeting Method");
    }

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) { //will call the default constructor if no constructor 
        // super();     //will directly called if no super(...) is called over here, and it will call the default the constructor of the superClass
        super(l, h, w, 4);    //what is this super()?? --> call the parent class constructor of 3 arguments as the parameter
        //used to initialize values present in the parent class
        this.weight = -1;
        this.h = 67;
        System.out.println(super.h);
        super.displayInfo();
        // this.age = 23;  //age can't be accessed as it is private in Box(It can be used within that file only)
    }

    public BoxWeight(BoxWeight old) {
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
    
}