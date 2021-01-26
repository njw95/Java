import java.util.Scanner;

public class cf427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = 0;
        int mp = 0;

        while(n-- > 0) {
           mp += sc.nextInt();
           if(mp<0) {
               u++;
               mp = 0;
           }
        }
        System.out.println(u);
    }
}