public class RemoveVowels{
    public static void main(String[] args){
        System.out.println(removeVowels("iloveindia"));
    }
    public static String removeVowels(String s){
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            ans += s.charAt(i);
        }
        return ans;
    }
}