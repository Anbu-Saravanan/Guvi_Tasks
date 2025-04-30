package StudentManagementSysem.collection;

import java.util.Stack;

public class StackImplementation {

        static Stack<Integer> stack = new Stack<>();

        // Method to push elements
        public static void pushElement(int element) {
            stack.push(element);
            System.out.println("Pushed: " + element);
        }

        // Method to pop elements
        public static void popElement() {
            if (!stack.isEmpty()) {
                int popped = stack.pop();
                System.out.println("Popped: " + popped);
            } else {
                System.out.println("Stack is empty. Cannot pop.");
            }
        }

        public static void main(String[] args) {
            // Pushing elements
            pushElement(12);
            pushElement(13);
            pushElement(14);

            // Printing current stack
            System.out.println("Current Stack: " + stack);

            // Popping an element
            popElement();
            System.out.println("Stack after pop: " + stack);

            int a = 10; // Assign a value to a
            System.out.println("a = " + a);
            int b = a;
            b = 30;
            System.out.println("a = " + a + " after change to b");


        }
}
