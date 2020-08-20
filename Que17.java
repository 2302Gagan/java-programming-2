import java.util.*;

public class Que17 {
    public static Stack<Integer> s(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<Integer>();
        while(!input.isEmpty()) {
            int temp = input.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > temp) {
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }
    public static void main(String args[]) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        input.add(50);
        input.add(60);
        System.out.println("Stack: \n"+input);
        Stack<Integer> tmpStack = s(input);
        System.out.println("\nSorted Stack:");
        while (!tmpStack.empty()) {
            System.out.print(tmpStack.pop() + " ");
        }
    }
}
