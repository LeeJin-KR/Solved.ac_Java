import java.util.Scanner;

public class P2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        double score;
        if(a.charAt(0) == 'A'){
            score = 4;
            System.out.println(a.charAt(1) =='+' ? score+0.3 : a.charAt(1) == '0' ? score : score-0.3);
        }
        if(a.charAt(0) == 'B'){
            score = 3;
            System.out.println(a.charAt(1) =='+' ? score+0.3 : a.charAt(1) == '0' ? score : score-0.3);
        }
        if(a.charAt(0) == 'C'){
            score = 2;
            System.out.println(a.charAt(1) =='+' ? score+0.3 : a.charAt(1) == '0' ? score : score-0.3);
        }if(a.charAt(0) == 'D'){
            score = 1;
            System.out.println(a.charAt(1) =='+' ? score+0.3 : a.charAt(1) == '0' ? score : score-0.3);
        }
        if(a.charAt(0) == 'F'){
            System.out.println("0.0");
        }
    }
}
