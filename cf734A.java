import java.util.Scanner;
public class cf734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        int a=0; //Anton score
        for(char c : s.toCharArray()) {
            if(c == 'A') a++;
            else a--;
        }
        System.out.println(a>0 ? "Anton" : (a<0) ? "Danik" : "Friendship");
    }
}