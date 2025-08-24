package oops.oops4.access;

public class A{
    protected int num;
    String name;
    public int number = 77;
    private String address = "INDIA";
    int[] arr;

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public A() {
        System.out.println("This is Parent class default Constructor");
    }


    public int getNum(){
        return num;
    }
}