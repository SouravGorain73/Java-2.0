// import java.util.Arrays;

public class Basic{
    public static void main(String[] args) {

        // ///Store 5 roll nos
        // int[] roll = new int[5];

        // //Store 5 name
        // String[] name = new String[5];

        // //Store data of 5 students - roll no, name, marks
        // int[] Roll = new int[5];
        // String[] names = new String[5];
        // float[] marks = new float[5];


        // Student[] student = new Student[5];

        // Student kunal;
        // kunal = new Student();


        Student kunal = new Student();

        kunal.rollno = 21;
        kunal.name = "Kunal Kushwaha";
        kunal.marks = 87.65f;

        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
    }
}

//Create a class
class Student{
    int rollno;
    String name = "Rahul";
    float marks = 90;
}