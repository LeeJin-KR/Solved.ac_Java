import java.util.Scanner;

public class P25238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b=sc.nextDouble(), c = (a*b)/100;
        System.out.println(a-c >= 100 ? "0" : "1");
    }
}
