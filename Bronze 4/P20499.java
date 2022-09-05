import java.util.Scanner;

public class P20499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b[] = a.split("/");
        int a1 = Integer.parseInt(b[0]) + Integer.parseInt(b[2]);
        int a2 = Integer.parseInt(b[1]);
        System.out.println(a1<a2 || a2==0 ? "hasu" : "gosu");
    }
}
