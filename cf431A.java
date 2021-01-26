import java.util.Arrays;
import java.util.Scanner;

public class cf431A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //or just use for loop to scan in the 4 integers
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String s = sc.nextLine();
        sc.close();

        int t=0;
        for(char c : s.toCharArray()) {
            t += a[c-49];
        }
        System.out.println(t);
    }
}