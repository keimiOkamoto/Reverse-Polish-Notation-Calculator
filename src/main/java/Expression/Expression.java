package Expression;

import java.util.List;
import java.util.Stack;

/**
 * Created by keimiokamoto on 20/10/2015.
 */
public class Expression<T> {
    private Stack<T> expression;

    public Expression(Stack<T> expression) {
        this.expression = expression;
    }

    public List<T> get() {
        return expression;
    }

    public T pop() {
        return expression.pop();
    }

    public T push(T item) {
        return expression.push(item);
    }
}
