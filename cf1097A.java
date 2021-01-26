import java.util.Scanner;

public class cf1097A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String table = sc.nextLine(); //table card
        Boolean p = false; //playable

        for(int i=0; i<5; i++) {
            String hand = sc.next(); //scan until space
            if(hand.charAt(0) == table.charAt(0) || hand.charAt(1) == table.charAt(1)) p = true;
        }
        sc.close();
        System.out.println(p ? "YES" : "NO");
    }
}