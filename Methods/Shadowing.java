public class Shadowing{
    static int x = 90;
    public static void main(String[] args){
        System.out.println(x);      //90
        int x;                      //this shadowed the variable x;
        //System.out.println(x);      //Giving error as x is shadowed
        x = 40;
        System.out.println(x);      //40
        fun(x);
    }

    static void fun(int val){
        System.out.println(val);
        System.out.println(x);      //Actual value is not changed
    }
}