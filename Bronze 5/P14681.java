import java.util.Scanner;

public class P14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b=sc.nextInt();
        if(a*b > 0){
            System.out.println(a>0 ? "1" : "3");
        }
        if(a*b <0){
            System.out.println(a>0 ? "4" : "2");
        }
    }
}
