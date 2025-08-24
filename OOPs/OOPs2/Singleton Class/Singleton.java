public class Singleton{

    private Singleton() {

    }

    static private Singleton instance;

    static public Singleton getInstance(){
        //check wheather 1 obj only created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        
    }
}