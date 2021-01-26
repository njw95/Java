import java.util.Scanner;
public class cf271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a, b, c, d;
        
        do {
            n++;
            a = n/1000;
            b = (n/100)%10;
            c = (n%100)/10;
            d = n%10;
        }while(a==b || a==c || a==d || b==c || b==d || c==d);

        System.out.println(n);
    }
}