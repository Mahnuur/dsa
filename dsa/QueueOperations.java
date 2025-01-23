import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueOperations {

    // Reverse the first K elements of a Queue
    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (queue == null || k > queue.size() || k <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        Stack<Integer> stack = new Stack<>();

        // Push the first K elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Enqueue back the elements from the stack
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Move the remaining elements to the back of the queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.poll());
        }
    }

    // Implement getMinimum() function for the Queue
    public static int getMinimum(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int min = Integer.MAX_VALUE;

        // Iterate through the queue to find the minimum value
        for (int value : queue) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Original Queue: " + queue);

        // Task 1: Reverse the first K elements
        int k = 3;
        reverseFirstKElements(queue, k);
        System.out.println("Queue after reversing first " + k + " elements: " + queue);

        // Task 2: Get the minimum element in the queue
        int min = getMinimum(queue);
        System.out.println("Minimum element in the queue: " + min);
    }
}

