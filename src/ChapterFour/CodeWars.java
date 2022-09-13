package ChapterFour;

import static java.lang.Integer.parseInt;
public class CodeWars {
    //Given n, take the sum of the digits of n.
    // If that value has more than one digit,
    // continue reducing in this way until a single-digit number is produced.
    // The input will be a non-negative integer.
    
    public static int digital_root(int n) {
        int result = 0;
        String nConvert = String.valueOf(n);
        char[] outCome = nConvert.toCharArray();
        int result2 = 0;
        int result3 = 0;
        if (outCome.length!=1)
           for (char c : outCome) {
               result2 += parseInt(String.valueOf(c));
               }
        if (result2 > 1){
            String conti = String.valueOf(result2);
            char[] c2 = conti.toCharArray();
            for (char c1 : c2) {
                result3 += parseInt(String.valueOf(c1));
            }
        }
        if (result3 > 1) {
            String contin = String.valueOf(result3);
            char[] c3 = contin.toCharArray();
            for (char c1 : c3) {
                result += parseInt(String.valueOf(c1));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(CodeWars.digital_root(999988877));
    }
}