public class Student implements  Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " " + rollno;
    }



    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        //if diff == 0 : means both are equals
        //if diff < 1: means o is bigger else o is smaller
        return diff;
    }

    
}