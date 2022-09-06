import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double king = 0, temp = 0;
        double arr[] = new double[(int) a];
        for(int i=0;i<a;i++){
            double d = sc.nextInt();
            if(d>king){
                king = d;
            }
            arr[i] = d;
        }
        for(int i=0;i<a;i++){
            temp += (arr[i]/king)*100;
        }
        System.out.println(temp/a);

    }
}
