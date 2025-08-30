import java.math.BigInteger;
import java.util.Arrays;

class DivisibilityArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibilityArray("998244353", 3)));
    }

    public static int[] divisibilityArray(String word, int m) {
        char[] ch = word.toCharArray();
        int[] ans = new int[ch.length];
        BigInteger val = BigInteger.ZERO;
        for(int i = 0; i < ch.length; i++){
            int n = ch[i] - 48;
            val = val.multiply(BigInteger.TEN).add(BigInteger.valueOf(n));
            if(val.mod(BigInteger.valueOf(m)).equals(BigInteger.ZERO)){
                ans[i] = 1;
            }
            else{
                ans[i] = 0;
            }
        }
        return ans;
    }
}