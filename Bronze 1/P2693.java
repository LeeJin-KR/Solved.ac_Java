import java.util.*;

public class P2693{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(10);
        for(int i=0;i<a;i++){
            arr.clear();
            for(int j=0;j<10;j++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            System.out.println(arr.get(7));
        }
    }
}
