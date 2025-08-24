// public class InnerClasses{

//     static class Test{
//         String name;

//         Test(String name){
//             this.name = name;
//         }
//     }

//     public static void main(String[] args) {    
//         // InnerClasses obj = new InnerClasses();
//         Test obj1 = new Test("kunal");
//         Test obj2 = new Test("rahul");

//         System.out.println(obj1.name);
//         System.out.println(obj2.name);
//     }
// }

public class InnerClasses{

    class Test{
        String name;

        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {    
        InnerClasses obj = new InnerClasses();
        InnerClasses.Test obj1 = obj.new Test("kunal");
        InnerClasses.Test obj2 = obj.new Test("rahul");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
