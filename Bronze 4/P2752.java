import java.util.Scanner;

public class P2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b=sc.nextInt(),c=sc.nextInt();
        if(a>b&&a>c){
            System.out.print(b>c ? c+" "+b+" ":b+" "+c+" ");
            System.out.print(a);

        }
        if(b>a&&b>c){
            System.out.print(a>c ? c+" "+a+" ":a+" "+c+" ");
            System.out.print(b);
        }
        if(c>b&&c>a){
            System.out.print(b>a ? a+" "+b+" ":b+" "+a+" ");
            System.out.print(c);
        }
    }
}
