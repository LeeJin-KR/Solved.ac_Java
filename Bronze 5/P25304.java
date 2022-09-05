import java.util.Scanner;

public class P25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt(), a = sc.nextInt(), temp =0;
        for(int i=0;i<a;i++){
            temp += sc.nextInt()*sc.nextInt();
        }
        System.out.println(all == temp ? "Yes" : "No");
    }
}
