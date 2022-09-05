import java.util.Scanner;

public class P14928{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        long b = 0;
        for(int i=0; i<a.length();i++){
            b = (b*10 + (a.charAt(i) - '0')) % 20000303;
        }
        System.out.println(b);
    }
}