package oops.oops4.mypackage;

import oops.oops4.access.A;

public class Main extends A{

    public Main(int n, String naam) {
        super(n, naam);
    }

    public static void main(String[] args) {
        Main obj = new Main(7, "DHONI");
        int n = obj.num;
        System.out.println(n);
        // System.out.println(obj.address); //Can't access a private variable in another package directly(not even in another file)
        System.out.println(obj.num);
        System.out.println(obj.number);
        // System.out.println(obj.name);    //Can't access the default access modifier variable
        
    }

    
    
}