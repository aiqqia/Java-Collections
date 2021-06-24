import java.util.Stack;

public class LearningStack {

    public static void main(String[] args){
        Stack<String> animals = new Stack<String>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack : " +animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println(animals.peek());

        System.out.println("Stack : " +animals);
    }
}
