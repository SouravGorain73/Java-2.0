package oops.oops4.access;

public class Am extends A{

    public Am(int n, String naam) {
        super(n, naam);
    }

    public static void main(String[] args) {
        Am obj = new Am(7, "DHONI");
        int n = obj.num;
        System.out.println(n);

        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Object);
        System.out.println(obj.getClass());
        // System.out.println(obj.getName());
        System.out.println(obj.getClass().getName());
        
    }
    
}