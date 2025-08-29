public class RepeatedString{
    public static void main(String[] args) {
        int ans = repeatedStringMatch("abcd", "cdabcdab");
        System.out.println(ans);
    }
    public static int repeatedStringMatch(String a, String b) {
        int len = b.length()/a.length();
        String res = a;
        if(b.length() <= a.length()){
            len++;
        }
        int i = 1;
        while(i < len + 2){
            String[] arr = res.split(b);
            if(arr.length == 2){
                return i;
            }
            res = res + a;
            i++;
        }
        return -1;
    }
}