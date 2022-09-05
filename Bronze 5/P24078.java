import java.math.BigInteger;
import java.util.Scanner;

public class P24078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextBigInteger().remainder(BigInteger.valueOf(21)));
    }
}
