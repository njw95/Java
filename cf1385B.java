import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class cf1385B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt() * 2;
            Set<Integer> st = new LinkedHashSet<>();

            while(n-- > 0) {
                st.add(sc.nextInt());
            }

            for(int num : st) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}