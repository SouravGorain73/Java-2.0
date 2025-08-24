import java.awt.SystemTray;
import java.lang.management.*;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

public class GCMonitor {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Student obj = new Student();
        }
        System.out.println(obj.name);
        
    }
}
class Student{
    String name;
    int roll;
    Student(){
        this.name  = "White";
        this.roll = 444;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }   
}
