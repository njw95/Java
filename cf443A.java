import java.util.HashSet;
import java.util.Scanner;

public class cf443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> st = new HashSet<>();

        String s = sc.nextLine();
        sc.close();

        for(Character c : s.toCharArray()) {
            if(Character.isLetter(c)) st.add(c);
        }
        System.out.println(st.size());
    }
}