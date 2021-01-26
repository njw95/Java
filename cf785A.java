import java.util.Scanner;

public class cf785A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;

        while(n-- > 0) {
            String s = sc.next();
            char ch =  s.charAt(0);
            if(ch == 'T') c+=4;
            else if(ch == 'C') c+=6;
            else if(ch == 'O') c+=8;
            else if(ch == 'D') c+=12;
            else c+=20;
        }
        sc.close();
        System.out.println(c);
    }
}