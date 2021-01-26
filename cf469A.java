import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class cf469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<Integer>();

        int n = sc.nextInt();

        int p = sc.nextInt();//size of first line
        while(p-- > 0) {
            s.add(sc.nextInt());
        }

        p = sc.nextInt();//size of second line
        while(p-- > 0) {
            s.add(sc.nextInt());
        }

        System.out.println((s.size()==n) ? "I become the guy." : "Oh, my keyboard!");
    }
}