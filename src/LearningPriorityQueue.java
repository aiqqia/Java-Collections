import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearningPriorityQueue {

    public static void main(String[] args){

        //PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); //We can even write Queue here instead of priority queue

        Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder()); //this implements maxheap

        pq.offer(50);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);//implements minheap smallest element at the top

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
