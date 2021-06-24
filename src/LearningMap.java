import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearningMap {
    public static void main(String[] args) {

        //Map<String,Integer> numbers = new HashMap<>();
        Map<String,Integer> numbers = new TreeMap<>(); //this puts keys in a bst under the hood based on string not int in this case : O(log n)

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);

        //numbers.put("Two", 5);//this overrides the previous value

        numbers.remove("Three");

        if(!numbers.containsKey("Two")) {
            numbers.put("Two", 5);
        }//similarly
        numbers.putIfAbsent("Two",5);

        System.out.println(numbers);

        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());

        //Iterating through maps:
        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //to work only with keys and not with values
        for(String key: numbers.keySet()){
            System.out.println(key);
        }
        //to work only with values and not with keys
        for(Integer value: numbers.values()){
            System.out.println(value);
        }

        System.out.println(numbers);

    }
}
