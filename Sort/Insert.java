import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[1000000];
        int temp, j;
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<a;i++){
            temp = arr[i];
            for(j=i-1; j>=0 && arr[j]>temp;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        for(int i=0;i<a;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
