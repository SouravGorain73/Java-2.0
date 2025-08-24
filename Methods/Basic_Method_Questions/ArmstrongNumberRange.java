public class ArmstrongNumberRange{
    public static void main(String[] args) {
        System.out.println("Armstrong Numbers of 3 digits are: ");
        for (int i = 100; i < 1000; i++){
            if(isArmstrong(i) == true){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int val){
        int originalValue = val;
        int sum = 0;
        while(val > 0){
            int rem = val % 10;
            sum += rem * rem * rem;
            val = val /10;
        }
        return sum == originalValue;
    }

}