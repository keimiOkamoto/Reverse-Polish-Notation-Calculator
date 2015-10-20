import Expression.Expression;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by keimiokamoto on 20/10/2015.
 */
public class ExpressionParserTest {

    @Test
    public void shouldBeAbleToCheckIfElementIsAConstant() {
        String expressionString = "324+-2+";

        Expression expression = new Expression(Arrays.asList(expressionString.split("")));
        ExpressionParser expressionParser = new ExpressionParser(expression, OperatorFactory.getInstance());

//        expressionParser.isConstant("");
    }
}
