package Collection_Framework;

import java.util.PriorityQueue;
//Первый встал в очередь, первый вышел
public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("1");
        priorityQueue.add("2");
        priorityQueue.add("3");
        priorityQueue.add("4");
        priorityQueue.add("5");
        System.out.println(priorityQueue);

        priorityQueue.remove();
        System.out.println(priorityQueue);

    }
}
