import java.util.Scanner;

public class P11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int b = sc.nextInt(), c=sc.nextInt();
            System.out.println("Case #"+(i+1)+": "+ b +" + "+ c + " = " + (b+c));
        }
    }
}
