import java.util.Arrays;
import java.util.Scanner;

public class cf339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("\\+");
        sc.close();
        Arrays.sort(s);
        System.out.print(String.join("+", s));
    }
}
