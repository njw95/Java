import java.util.HashSet;
import java.util.Scanner;

public class cf1325B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> s = new HashSet<>();
            for(int i=0; i<n; i++) {
                s.add(sc.nextInt());
            }
            System.out.println(s.size());
        }
        sc.close();
    }
}