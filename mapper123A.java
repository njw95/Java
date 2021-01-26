import java.util.HashMap;

public class mapper123A {
    public static void main(String[] args) {
    
        HashMap<Character, Integer> mapper = new HashMap<>();
        String s = "Hello my name is cocacola";

        for(char c : s.toCharArray()) {
            if(mapper.containsKey(c)) mapper.put(c, mapper.get(c)+1);
            else mapper.put(c, 1);
        }

        // for(Map.Entry e : mapper.entrySet()) {
        //     System.out.println(e.getKey() + " " + e.getValue());
        // }

        mapper.forEach((key, value) -> System.out.println(key + " " + value));
    }
}