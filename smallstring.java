import java.util.*;

public class smallstring {
  public static void main(String [] args) {
    try {
      Scanner scan = new Scanner(System.in);
      if (scan.hasNextLine()) {
        String string = scan.nextLine();
        scan.close();

        char[] s1 = new char[string.length()];

        for(int i=0; i<string.length(); i++) {
            s1[i] = string.charAt(i);
        }
        
        Arrays.sort(s1);
        String s2 = String.valueOf(s1);
        System.out.println(s2);
      }
    } catch (Exception e) {}
  }
}