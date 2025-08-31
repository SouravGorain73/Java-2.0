public class Main{
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // int c = a / b;       //Exception in thread "main" java.lang.ArithmeticException: / by zero  at Main.main(Main.java:5)
        try {
            // divide(a, b);
            String name = "Kunal";
            if(name.equals("Kunal")){
                throw new MyException("Name is Kunal");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b)throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Can't divide by 0");
        }
        else{
            return a / b;
        }
    }
}