
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        Student kunal = new Student(21, 89.12f);
        Student sourav = new Student(37, 83.57f);
        Student rahul = new Student(12, 98.65f);
        Student sachin = new Student(24, 87.76f);
        Student ankit = new Student(11, 92.23f);

        Student[] list = {kunal, sourav, rahul, sachin, ankit};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                return -(int)(o1.marks - o2.marks);
            }
        });

        System.out.println(Arrays.toString(list));
        
        // if(kunal.compareTo(sourav) > 0){     //which parameter you want to compare
        //     System.out.println(kunal.compareTo(sourav));
        //     System.out.println("Kunal has more marks");
        // }
    }
}