import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class P2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = '1';
        for (int i=0;i<a.length();i++){
            b = a.charAt(i);

            if(Character.isUpperCase(b)){
                System.out.print(String.valueOf(b).toLowerCase());
            }else{
                System.out.print(String.valueOf(b).toUpperCase());
            }
        }
    }
}
