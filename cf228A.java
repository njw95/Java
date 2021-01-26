import java.util.HashSet;
import java.util.Scanner;
public class cf228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> s = new HashSet<>();

        int n = 4;

        for(int i=0; i<n; i++) {
            s.add(sc.nextInt());
        }

        System.out.println(n-s.size());
    }
}