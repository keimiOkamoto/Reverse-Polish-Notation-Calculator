import Expression.Expression;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by keimiokamoto on 20/10/2015.
 */
public class ExpressionParser<T> {

    private Expression expression;
    private OperatorFactory operatorFactory;

    public ExpressionParser(Expression expression, OperatorFactory operatorFactory) {
        this.expression = expression;
        this.operatorFactory = operatorFactory;
    }

    public Collection<T> parse() {
        ArrayList<String> list = expression.get();
        for(String token : list) {
            if (isOperator(token)) {

            }
            //operand or operator
        }
        return null;
    }

    private boolean isOperator(String token) {
        //check for symbols or check for types.
        return false;
    }

}
