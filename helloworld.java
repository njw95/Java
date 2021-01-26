import java.util.Scanner;
     
public class helloworld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next(); //start
        String e = sc.next(); //end
        sc.close();
 
        int ans = 0;
 
        for(int i=0; i<n; i++)  {
            ans += Math.min(Math.abs(s.charAt(i)-e.charAt(i)), 10 - Math.abs(s.charAt(i) - e.charAt(i)));
        }
        System.out.println(ans);
    }
}