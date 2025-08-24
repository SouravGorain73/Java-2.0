public class Constructor{
    public static void main(String[] args) {

        //
        // final int bonus = 2;
        // bonus = 3;

        Student kunal = new Student();
        // kunal.name = "Kunal Kushwaha";
        // System.out.println(kunal.rollno);
        // System.out.println(kunal.name);
        // System.out.println(kunal.marks);

        // Student rahul = new Student();
        // kunal.changeName("Alex");
        kunal.greeting();

        // Student s1 = new Student(21, "Sourav Gorain", 87.56f);
        // System.out.println(s1.rollno);
        // System.out.println(s1.name);
        // System.out.println(s1.marks);

        Student sourav = new Student(kunal);    //Coping all the attributes of Kunal to sourav using the constructor passing arguments of Student datatype
        // System.out.println(sourav.rollno);
        // System.out.println(sourav.name);
        // System.out.println(sourav.marks);

        sourav.display();

        Student sougata = new Student(149, "sougata", 87.8f);
        sougata.display();

        System.out.println();

        final Student obj = new Student("Babu");
        obj = new Student("Sona");

        System.out.println(obj.name);
        System.out.println();

        obj.display();
    }
}

class Student{
    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello " + this.name);
        
    }

    void changeName(String newName){
        name = newName;
    }

    Student (Student other){            //Coping other's properties to the current object 
        this.name = other.name;
        this.rollno = 69;
        this.marks = other.marks;
        System.out.println("Constructor of student keyword");
        // this();
    }

    //We need to update the values for every object(Use of 'this' keyword)
    Student(){
        this(new Student(31, "Amit Kushwaha", 76.76f));
        this.rollno = 13;
        // this.name = "Kunal Kushwaha";
        this.marks = 87.76f;
        // Student aritra = new Student();
        // this(aritra);

        //Calling a constructor from another constructor
        //Internally: new Student(17, "Iron Man", 100.0f)
        // this(17, "Iron Man", 100.0f);
        // this();
        System.out.println("This is the default constructor");
    }

    Student(int rollno, String name, float marks){
        // this();
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        System.out.println("This is the constructor with 3 arguments");
        // this(Student);
    }

    Student(String name){
        this.name = "Khusbu";
        this.name = "Sujoy";
        this.name = "Bijoy";
    }

    void display(){                         //Used to print all the attributes of the current object by which it is called
        System.out.println(this.rollno);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
    
    
    // Student(int rollno, String name, float marks){
    //     rollno = rollno;    //Assignment to itselt 
    //     name = name;
    //     marks = marks;
    //     System.out.println(rollno + " " +  name + " " + marks);
    // }
}