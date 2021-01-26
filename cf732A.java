import java.util.Scanner;

public class cf732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        int m = 1;

        while(true) {
            if((m*k)%10==0 || (m*k -r)%10==0) {
                System.out.println(m);
                break;
            }
            m++;
        }
    }
}