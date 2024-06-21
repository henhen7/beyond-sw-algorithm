package c_queue;

import c_queue.practice.ArrayListQueue;
import c_queue.practice.ArrayQueue;
import c_queue.practice.LinkedQueue;
import c_queue.practice.Queue;

public class QApplication {
    public static void main(String[] args) {
//        // 자바에서 제공하는 큐 테스트
//        Queue<String> queue = new ConcurrentLinkedQueue<>();
//
//        queue.add("딸기");
//        queue.add("사과");
//
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.contains("딸기"));
//        System.out.println(queue.contains("사과"));
//        System.out.println();

//        // ArrayQueue 구현 및 테스트
//        Queue<String> queue = new ArrayQueue<>(5);
//        queue.enqueue("딸기");
//        queue.enqueue("포도");
//
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.dequeue());
//        queue.enqueue("바나나");
//        queue.enqueue("사과");
//        queue.enqueue("복숭아");
//        queue.enqueue("오렌지");
//        System.out.println(queue);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.contains("딸기"));
//        System.out.println(queue.contains("포도"));
//        System.out.println();

//        // LinkedQueue 구현 및 테스트
//        Queue<String> queue = new LinkedQueue<>();
//        queue.enqueue("딸기");
//        queue.enqueue("포도");
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.dequeue());
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.contains("딸기"));
//        System.out.println(queue.contains("포도"));

        // ArrayListQueue 구현 및 테스트
        Queue<String> queue = new ArrayListQueue<>(5);
        queue.enqueue("딸기");
        queue.enqueue("포도");
        queue.enqueue("복숭아");

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.contains("딸기"));
        System.out.println(queue.contains("포도"));
        System.out.println();
    }
}
