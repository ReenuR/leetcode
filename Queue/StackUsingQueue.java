package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> que1;
    Queue<Integer> que2;
    public StackUsingQueue() {
        que1 = new LinkedList<>();
        que2 = new LinkedList<>();
    }

    public static void main(String[] args) {
        StackUsingQueue myStack = new StackUsingQueue();
        myStack.push(5);
        myStack.push(10);
        System.out.println(myStack.pop()); // 10
        System.out.println(myStack.top()); // 5
        System.out.println(myStack.pop()); // 5
        System.out.println(myStack.empty());
    }

    private int top() {
        return 0;
    }

    private boolean empty() {
        return false;
    }

    private int pop() {
        return 0;
    }

    private void push(int i) {

        que2.add(i);
        while(!que1.isEmpty()){
            que2.add(que1.remove());
        }
        Queue<Integer> temp = que1;
        que1 = que2;
        que2 = temp;
    }
}
