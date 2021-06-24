import java.util.ArrayDeque;

public class LearningArrayDeque {
    //this is basically a doubly ended queue
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); //adds to rear
        adq.offerFirst(12); //adds to head
        adq.offerLast(45); //same as offer
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " +adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " +adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " +adq);

        //we can implement stack using deque using offer and polllast functions
    }
}
