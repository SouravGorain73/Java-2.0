
import java.util.Arrays;

public class ReverseWords{
    public static void main(String[] args){
        String ans = reverseWords("example   good a");
        System.out.println(ans);
    }
    static public String reverseWords(String s) {
        String t = "";
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        for(int i = str.length-1; i >= 0; i--){
            if(str[i].equals("")){
                continue;
            } 
            else if(i != 0){
                t = t + str[i] + " ";
            }
            else{
                t = t + str[i];
            }
        }
        return t;
    }
}