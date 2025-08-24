

public class StringMultiply{
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String s = multiply(num1, num2);
        // System.out.println(s);
    }
    public static String multiply(String num1, String num2) {
        
        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();
        long val1 = 0;
        long val2 = 0;
        for(int i = 0; i < ch1.length; i++){
            val1 = val1*10 + ch1[i];
        }
        for(int j = 0; j < ch2.length; j++){
            val2 = val2*10 + ch2[j];
        }
        long res = val1 * val2;

        String ans = Long.toString(res);
        // char[] ch1 = num1.toCharArray();
        // int val = 0;
        // for(int i = 0; i < ch1.length; i++){
        //     val = val*10 + ch1[i];
        // }
        // System.out.println();
        // // for(int i = 0; i < num1.length(); i++){
        // //     ans = ans
        // // }
        return ans;
    }
}