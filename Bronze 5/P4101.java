import java.util.Scanner;

public class P4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt(), b=sc.nextInt();
            if(a==0&&b==0){
                break;
            }else{
                System.out.println(a > b ? "Yes" : "No");
            }
        }
    }
}
