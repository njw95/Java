import java.util.Scanner;

public class cf1367A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
           String b = sc.next();
           for(int i=0; i<b.length(); i+=2) {
               System.out.print(b.charAt(i));
           }
           System.out.print(b.charAt(b.length()-1));
           System.out.println();
        }
    }
}