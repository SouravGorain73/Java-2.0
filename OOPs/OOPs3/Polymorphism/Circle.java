public class Circle extends Shapes{
    //This will run when object of circle is created hence it is overriding the parent method
    @Override   //This is called Annotation
    void area(){        //Overriding
        System.out.println("Area is pie * r * r");
    }
}