public class Main{
    public static void main(String[] args) {
        // Box box = new Box(4.6, 8.6, 8.9);
        // Box box1 = new Box(box);

        // System.out.println(box.weigth);      //Can't access the properties of a child class from the object of the parentClass of BaseClass

        // System.out.println(box.l + " " + box.w + " " + box.h);

        // System.out.println(box1.l + " " + box1.w + " " + box1.h);

        // BoxWeight box3 = new BoxWeight();
        // System.out.println(box3.h + " " + box3.weight);

        // BoxWeight box4 = new BoxWeight(2, 3, 4, 6);

        // System.out.println(box4.h + " " + box4.l + " " + box4.w + " " + box4.weight);


        // Box box5 = new BoxWeight(2, 3, 4, 8);       //UPCASTING

        // System.out.println(box5.h);
        // System.out.println(box5.width);

        // BoxWeight box6 = new Box();

        // Box box7 = new BoxWeight(2, 4, 6, 8);
        // BoxWeight box8 = (BoxWeight) box7;      //DOWNCASTING

        // System.out.println(box7.weight);
        // System.out.println(box8.weight);


        BoxPrice box = new BoxPrice(5, 8, 200);

        Box box1 = new BoxWeight();
        box1.greeting();
        Box.greeting();

        BoxWeight box2 = new BoxPrice();
        box2.greeting();
        BoxWeight.greeting();

        box.getL();
    }
}