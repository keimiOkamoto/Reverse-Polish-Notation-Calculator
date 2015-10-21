import Expression.Expression;

import java.util.Arrays;
import java.util.List;

/**
 * Created by keimiokamoto on 20/10/2015.
 */
public class ExpressionParser<T> {

    private String unparsedExpression;
    private OperatorFactory operatorFactory;

    public ExpressionParser(String unparsedExpression, OperatorFactory operatorFactory) {
        this.unparsedExpression = unparsedExpression;
        this.operatorFactory = operatorFactory;
    }

    public Expression parse() {
        List<String> unparsed = Arrays.asList(unparsedExpression);
        unparsed.stream().filter(token -> isOperator(token)).forEach(token -> {
            if (isOperator(token)){

            }
        });
        return null;
    }

    private boolean isOperator(String token) {
        return  token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

}
