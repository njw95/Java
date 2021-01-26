import java.util.Scanner;

public class cf155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int curr = sc.nextInt(); //first score
        int mi = curr, ma = curr;

        while(--n > 0) {
            curr = sc.nextInt();
            if(curr > ma || curr < mi) {
                a++;
                mi = Math.min(mi, curr);
                ma = Math.max(ma, curr);
            }
        }
        System.out.println(a);
        sc.close();
    }
}