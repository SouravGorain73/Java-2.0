import java.util.Scanner;
public class EvenLengthWords{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String ans = "";
        String s = input.nextLine();
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++){
            char[] ch = words[i].toCharArray();
            if(ch.length % 2 == 0){
                ans += words[i] + " ";
            }
        }
        System.out.println("String with even length words: " + ans);
    }
}