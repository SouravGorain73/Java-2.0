public class Method_Overloading{
    public static void main(String[] args) {
        // fun(7);             //According to the data type of the parameter in compile time it is decided to call which method
        System.out.println(sum(2, 3, 5));         //According to the number of parameters passed, the executable method will be decided
        // demo(7);
        // sum();                      //This also gives error as it can't get the executable method at the compile time as no argument is passed
    }

    // static void demo(int n){
    //     System.out.println("This is :" + n);
    // }

    // static void demo(int m){                /*Gives error as method overloading only works while there are different data types are passing as arguments
    //                                         or the number of arguments would be different */
    //     System.out.println("It is :" + m);
    // }

    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    static int sum(int a, int  b, int c){
        int sum = a + b + c;
        return sum;
    }

    // static void fun(int n){
    //     System.out.println("Number: " + n);
    // }

    // static void fun(String name){
    //     System.out.println("Hello " + name);
    // }
}