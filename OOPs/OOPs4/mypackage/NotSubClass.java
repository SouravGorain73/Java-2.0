package oops.oops4.mypackage;

import oops.oops4.access.A;

public class NotSubClass{

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.number);
        // System.out.println(obj.num);     //Can't access a variable which is protected as the access modifier
        // System.out.println(obj.address);    //Can't access a variable which is private as the access modifier
        // System.out.println(obj.name);        //Can't access a variable which is default(not default) as the access modifier
    }
    
}