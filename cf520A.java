import java.util.HashSet;
import java.util.Scanner;

public class cf520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();
        sc.close();

        HashSet<Character> st = new HashSet<>();

        for(char c : s.toCharArray()) {
            st.add(c);
        }
        System.out.println((st.size()==26) ? "YES" : "NO");
    }
}