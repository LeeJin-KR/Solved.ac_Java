import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ar.add(Integer.parseInt(String.valueOf(arr[i])));
        }
        Collections.sort(ar);
        for(int i=arr.length;i>0;i--){
            System.out.print(ar.get(i-1));
        }

    }
}
