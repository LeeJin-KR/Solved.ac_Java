import java.util.*;

public class P10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>(3);
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        Collections.sort(a);
        System.out.println(a.get(1));
    }
}
