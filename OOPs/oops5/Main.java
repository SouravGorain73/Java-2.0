public class Main{
    public static void main(String[] args) {
        Son son = new Son(21);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(18);
        daughter.career();
        daughter.partner();  
        Parent.hello();
    }
}