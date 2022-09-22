import java.util.Scanner;

public class P25372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        int b = Integer.parseInt(sc.nextLine());
        for (int i=0;i<b;i++){
            a = sc.nextLine();
            System.out.println(a.length()>=6 && 9>=a.length() ? "yes" : "no");
        }
    }
}
