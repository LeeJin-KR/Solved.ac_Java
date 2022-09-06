import java.util.Scanner;
/*선택 정렬 사용*/
public class P2750{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[10000000];
        int temp = 0;
        int min = 0;
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            min = i;
            for(int j=0;j<a;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for(int i=a-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
