public class SearchString{
    public static void main(String[] args) {
        String name = "Sourav";
        char target = 'a';
        int ans = Searching(name, target);
        System.out.println(target + " is found at the index: " + ans);
    }

    static int Searching(String str, char t){
        if(str.length() == 0){
            return -1;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == t){
                return i;
            }
        }
        return -1;
    }
}