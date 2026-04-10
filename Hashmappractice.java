import java.util.HashMap;
public class Hashmappractice {
    public static void main(String[] args) {
       HashMap<Character,Integer> m= new HashMap<>();
       String s="Leetcode";
       for(char ch:s.toCharArray()){

        if (m.containsKey(ch)){

        m.put(ch ,m.get(ch)+1);
        }
        else{
            m.put(ch,1);
        }
       }
       System.out.println(m);

    }
}

