import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class P1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        String arr[] = new String[b];
        String temp ="";
        for(int i=0;i<b;i++){
            arr[i] = sc.next();
        }
        for(int i=0;i<b;i++){
            for(int j=0;j<b;j++) {
                if (arr[i].length() < arr[j].length()) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                if(arr[i].length()==arr[j].length()){
                    if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j])){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        for(int i=0;i<b;i++){
            System.out.println(arr[i]);
        }

    }
}
