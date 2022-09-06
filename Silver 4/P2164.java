import java.io.*;
import java.util.ArrayList;

public class P2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = br.read()-'0';
        br.close();
        ArrayList<Integer> b = new ArrayList<Integer>(a);
        for(int i=1;i<=a;i++) {
            b.add(i);
        }
        while(b.size()!=1){
            b.remove(0);
            b.add(b.get(0));
            b.remove(0);
        }
        System.out.println(b.get(0));
    }
}
