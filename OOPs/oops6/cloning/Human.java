public class Human implements Cloneable{
    int age;
    String name;
    int[] arrr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2, 5, 7, 3, 9};
    }



    // public Human(Human other) {
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     //THis is Shallow Copy
    //     return super.clone();
    // }

     @Override
    public Object clone() throws CloneNotSupportedException{
        //THis is Deep Copy
        Human twin = (Human)super.clone();  //This si actually a shallow copy

        //making a deep copy
        twin.arr = new int[twin.arr.length];

        for(int i = 0; i < twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
    
}