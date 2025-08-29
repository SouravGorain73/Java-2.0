public class Kii{
    public static void main(String[] args) {
        String sentence = "Java programming is,fun";
        String[] words = sentence.split("is"); // Split by space or comma

        for (String word : words) {
            System.out.println(word);
        }
    }
}