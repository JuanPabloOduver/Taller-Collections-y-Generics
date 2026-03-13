package Punto5;
import java.util.Stack;

public class StackUtils {

    public static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j) {
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> result = new Stack<>();
        Stack<Integer> splicedElements = new Stack<>();

        while (!s.isEmpty()) {
            temp.push(s.pop());
        }

        int currentIndex = 0;
        while (!temp.isEmpty()) {
            Integer element = temp.pop();
            
            if (currentIndex >= i && currentIndex < j) {
                splicedElements.push(element);
            } else {
                s.push(element);
            }
            currentIndex++;
        }

        return splicedElements;
    }
}