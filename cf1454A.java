import java.util.Scanner;
public class cf1454A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            String s = String.valueOf(n);
            for(int i=1; i<n; i++) {
                s = s.concat(" " + i);
            }
            System.out.println(s);
        }
        sc.close();
    }
}
