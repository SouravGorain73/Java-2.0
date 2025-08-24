/*
    Anything that is initialised outside the block, can be used inside the the block.But anything that is initialised inside 
    the block can't be used outside.
    And, Anything that initialised outside the block, can't again initialised inside the block. But anything that is 
    initialised inside the block can be initialised again outside the block.
*/

public class Scoping{  
    public static void main(String[] args) {
        int n = 30;
        String name = "Sourav Gorain";

        //Scoping in Blocks
        {
            //int n = 70;     //Can't be initialized again inside the scope of class where n is previously initialized
            System.out.println(n);      //But previously initialized variables can be accessed from the block
            n = 50;         //We can also update them(The Original Reference Variable) inside the scope of the block
            System.out.println(n); //It will print the updated value of n as it is inside the scope of the block
            int x = 71;         //Values initialized inside the block will be accessed within this particular block only 
            System.out.println(name);
            name = "Software Developer";        //Same thing will happens for the String Datatype also
            System.out.println(name);

            int c = 32;
            fun(n);
            
            
        }
        System.out.println(n);          //The new updated value will be print as the Original Reference Variable is changed inside the block which is the actual variable

        System.out.println(name);       // Same for the String datatype also

        int c = 23;
        System.out.println(c);

        //System.out.println(x);      //Can't access the variables declaired in another scope of block

        //Scoping in for loops

        for(int i = 1; i < 5; i++){
            int num = 23;                  //num is intialised inside the for loop
            num = 100;
            System.out.println(i);
        }
        
        //System.out.println(num);        //We can't use the variables outside of the scope of a for loop

    }

    //Scoping in Methods
    static void fun(int val){
        int nums = 67;       //Can't be accessed outside this method
        System.out.println(val);
    }
}