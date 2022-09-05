import java.util.Scanner;

public class P10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), bg = sc.nextInt();
        for(int i=0;i<a;i++){
            int c = sc.nextInt();
            if(bg > c){
                System.out.print(c+" ");
            }
        }
    }
}
