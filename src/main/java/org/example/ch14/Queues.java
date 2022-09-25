//copy paste start for tutorials

package org.example.ch14;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

class QueueData<T>{
    private T data;
    public QueueData() {};
    public QueueData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "Data: [obj= " + data + " ]";
    }
}
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(6);
        Deque<Integer> dequeue = new LinkedBlockingDeque<>();
        System.out.println(queue.poll());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer((7));

        for(Integer element:queue) {
            System.out.println(element);
        }

        System.out.println("poll: " + queue.poll());
        for(Integer element:queue) {
            System.out.println(element);
        }

        System.out.println("---------------------------");
        dequeue.offerFirst(1);
        dequeue.offerLast(2);
        dequeue.offerFirst(3);
        dequeue.offerLast(4);
        dequeue.offerFirst(5);
        dequeue.offerLast(6);
        dequeue.offerFirst(7);
        for(Integer element:dequeue) {
            System.out.println(element);
        }
        System.out.println("---------------------------");

    }
}

