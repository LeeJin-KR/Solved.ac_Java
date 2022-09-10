import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Select{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[500000];
        int temp = 0, min;

        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            min = i;
            for(int j=i;j<a;j++){
                if(arr[min]>arr[j]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}