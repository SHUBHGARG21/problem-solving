import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class InBuildEx {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//        stack.push(1);
//        stack.push(130);
//        stack.push(102);
//        System.out.println((stack.pop()));
//        System.out.println((stack.pop()));
//        System.out.println((stack.pop()));
//        System.out.println((stack.pop()));
//        System.out.println((stack.pop()));


        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(10);

        queue.add(10);

//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(10);
//        deque.add(43);
//        deque.addLast(30);
//        deque.addFirst(100);
//        System.out.println(Arrays.toString(deque.toArray()));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(1);
        priorityQueue.add(12);
        priorityQueue.add(102);
        System.out.println(priorityQueue);







    }
}
