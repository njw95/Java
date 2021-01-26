import java.util.Scanner;
public class cf59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int u = 0, l = 0;

        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) u++;
            else l++;
        }
        System.out.println(u>l ? s.toUpperCase() : s.toLowerCase());
    }
}
