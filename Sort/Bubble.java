import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[500000];
        int temp = 0;
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
