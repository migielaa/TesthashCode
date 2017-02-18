import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class testhashCode {

    public static void main(String[] args) {

        Human a = new Human("a", "a", new Integer(0));
        Human b = new Human("a", "a", new Integer(0));
        Human c = new Human("a", "b", new Integer(0));
        System.out.println(a.equals(b));


        HashMap<Human, Integer> hm = new HashMap<>();
        hm.put(a,1);
        hm.put(b,2);
        hm.put(c,2);
        System.out.println(hm.size());
        Set set = new HashSet<>();
        set.add(a);
        set.add(b);
        System.out.println(set.size());
    }
}
