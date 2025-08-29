public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career(){
        System.out.println("I want to be an Engineering");
    }

    @Override
    void partner(){
        System.out.println("I Love Ironman");
    }
}