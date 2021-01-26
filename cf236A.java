import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class cf236A {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        Set<Character> st = new HashSet<Character>();

        for(int i=0; i<s.length(); i++) {
            st.add(s.charAt(i));
        }
        System.out.println(st.size()%2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}