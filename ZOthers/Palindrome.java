class Palindrome{
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int num = 0;
        while(x>0){
            int rem = x % 10;
            num = num * 10 + rem;
            x = x / 10;
        }
        System.out.println(num);
        if(x == num){
            return true;
        }
        else{
            return false;
        }
    }
}