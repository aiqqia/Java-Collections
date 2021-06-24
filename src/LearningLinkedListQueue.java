import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class LearningLinkedListQueue {

    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(12);//adds
        queue.offer(24);
        queue.offer(36);
        //offer() is better than add() because offer just return true or false but add may return an exception
        System.out.println(queue.poll()); //remove() instead of poll() but throws an exception

        System.out.println(queue);

        System.out.println(queue.peek()); //element() instead of peek() but throws an exception

    }
}
