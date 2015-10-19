import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by keimiokamoto on 18/10/2015.
 */
public class ReversePolishNotationCalculator implements Calculator {
    private Stack<Double> stack;

    public ReversePolishNotationCalculator() {
        this.stack = new Stack<>();
    }

    @Override
    public void input(double operand) {
        stack.push(operand);
    }

    @Override
    public void add() throws EmptyStackException {
        stack.push(stack.pop() + stack.pop());
    }

    @Override
    public void subtract() throws EmptyStackException {
        stack.push(stack.pop() - stack.pop());
    }

    @Override
    public void product() throws EmptyStackException {
        stack.push(stack.pop() * stack.pop());
    }

    @Override
    public void divide() throws EmptyStackException {
        stack.push(stack.pop() / stack.pop());
    }

    @Override
    public double getResult()  {
        if (stack.size() == 1) return stack.pop();
        else throw new IllegalArgumentException();
    }
}
