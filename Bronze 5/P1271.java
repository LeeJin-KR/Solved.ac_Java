import java.math.BigInteger;
import java.util.Scanner;

public class P1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger(), b= sc.nextBigInteger();
        System.out.println(a.divide(b)+"\n"+a.mod(b));
    }
}
