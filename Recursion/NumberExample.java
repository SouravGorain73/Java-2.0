public class NumberExample{
    public static void main(String[] args) {
        print(1);
        
    }


    static void print(int n){
        System.out.println(n);
        if(n == 5){                 //Base Condition
            return;
        }
        print(n+1);
    }

    // static void print1(int n){
    //     System.out.println(n);
    //     print2();
    // }
    // static void print2(int n){
    //     System.out.println(n);
    //     print3(3);
    // }
    // static void print3(int n){
    //     System.out.println(n);
    //     print4(4);
    // }
    // static void print4(int n){
    //     System.out.println(n);
    //     print5(5);
    // }
    // static void print5(int n){
    //     System.out.println(n);
    // }
}