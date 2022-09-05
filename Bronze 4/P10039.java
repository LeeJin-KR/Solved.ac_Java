import java.util.Scanner;

public class P10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp =0;
        for(int i=0;i<5;i++){
            int a = sc.nextInt();
            if(a<40){
                temp += 40;
            }else{
                temp += a;
            }
        }
        System.out.println(temp/5);
    }
}
