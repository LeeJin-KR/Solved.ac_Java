import java.util.Scanner;
import java.util.stream.StreamSupport;

public class P11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            System.out.println("Case #"+(i+1)+": "+(sc.nextInt()+sc.nextInt()));
        }
    }
}
