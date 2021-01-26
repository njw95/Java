import java.util.Scanner;
public class cf677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = 0; //width

        while(n-->0) {
            int a = sc.nextInt();
            w = (a<=h) ? w+1 : w+2;
        }
        sc.close();
        System.out.println(w);
    }
}