package Collection;
//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
// and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity O(1))
import java.util.Stack;
class Mystack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    private int capacity;
    public Mystack(int capacity) {
        this.capacity = capacity;
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    //to check isfull
    public boolean isFull() {
        return mainStack.size() == capacity;
    }
    //to check isEmpty
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
    //to push value
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        mainStack.push(x);
        if (minStack.isEmpty()||x<= minStack.peek()) {
            minStack.push(x);
        }
    }
    //to pop value from mystack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int poped = mainStack.pop();

        // Pop from minStack only if it matches the popped value
        if (poped == minStack.peek()) {
            minStack.pop();
        }
        return poped;
    }
    //to get min value
    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return minStack.peek();
    }
    public void printStackValues() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack values (Top to Bottom):");
        for (int i = mainStack.size() - 1; i >= 0; i--) {
            System.out.println(mainStack.get(i));
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        Mystack s = new Mystack(10);
        s.push(5);
        s.push(2);
        s.push(8);
        s.push(1);
        System.out.println("Stack values before min removal:");
        s.printStackValues();
        System.out.println("Min: " + s.getMin());
        s.pop();
        System.out.println("Stack values after top min removal:");
        System.out.println("Min: " + s.getMin());
    }
}
