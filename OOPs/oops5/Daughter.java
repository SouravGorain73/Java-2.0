public class Daughter extends Parent{

    

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career(){
        System.out.println("I want to be an Coder");
    }

    @Override
    void partner(){
        System.out.println("I Love Batman");
    }
}