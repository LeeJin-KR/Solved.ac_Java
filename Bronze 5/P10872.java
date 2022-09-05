import java.util.Scanner;

public class P10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        int a = sc.nextInt();
        while(a != 0){
            temp *= a;
            a--;
        }
        if(temp==0){
            System.out.println("1");
            System.exit(1);
        }
        System.out.println(temp);
    }
}
