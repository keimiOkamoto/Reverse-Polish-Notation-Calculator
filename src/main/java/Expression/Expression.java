package Expression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keimiokamoto on 20/10/2015.
 */
public class Expression {
    private List<String> expression;

    public Expression(List<String> expression) {
        this.expression = expression;
    }

    public List<String> get() {
        return expression;
    }
}
