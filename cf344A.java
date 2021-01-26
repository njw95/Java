import java.util.Scanner;
public class cf344A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() - 1;
        int prev = sc.nextInt(); //first magnet
        int g = 1;

        while(n-- > 0) {
            int curr = sc.nextInt();
            if(curr != prev) {
                g++;
                prev = curr;
            }
        }
        sc.close();
        System.out.print(g);
    }
}