import java.util.Scanner;

public class cf432A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //num ppl
        int k = sc.nextInt(); //win at least k times
        int y;
        int s = 0;

        while(n-- > 0) {
            y = sc.nextInt();
            if(5-y >= k) s++;
        }
        sc.close();
        System.out.println(s/3); 
    }
}