import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearningSet {

    public static void main(String[] args) {

        //Set<Integer> set = new HashSet<>(); //has random order because of hashing : O(1)
        //Set<Integer> set = new LinkedHashSet<>(); // additionally implements properties of linked lists as well (same order)
        Set<Integer> set = new TreeSet<>(); //implemented over a bst so shows in sorted order : O(log n)

        set.add(45);
        set.add(21);
        set.add(32);
        set.add(56);
        set.add(9);

        set.add(45);//ignores duplicates

        set.remove(21);

        System.out.println(set);

        System.out.println(set.contains(32));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);

    }
}
