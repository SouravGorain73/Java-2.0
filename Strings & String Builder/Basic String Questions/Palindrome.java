public class Palindrome{
    public static void main(String[] args) {
        // StringBuilder builder = new StringBuilder();
        // builder.append("abcdcba");
        // String str1 = builder.toString();
        // builder.reverse();
        // String str2 = builder.toString();



        // System.out.println(str1);
        // System.out.println(str2);

        // if(str1 == str2){
        //     System.out.println(str1 + " is a Palindrome.");
        // }
        // else{
        //     System.out.println(str1 + " is not a Palindrome.");
        // }


        String str ="ahbsa";
        int start = 0;
        int end = str.length() - 1;
        boolean bool = true;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else{
                System.out.println(str + " is not a Palindrome");
                bool = false;
                break;
            }
        }
        if(bool == true){
            System.out.println(str + " is a Palindrome");
        }
    }
}