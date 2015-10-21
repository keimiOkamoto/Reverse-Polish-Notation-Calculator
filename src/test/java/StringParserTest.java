import Expression.Expression;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by keimiokamoto on 20/10/2015.
 */
public class StringParserTest {

    @Test
    public void shouldBeAbleToCheckIfElementIsAConstant() {
        java.lang.String stringString = "324+-2+";

        Expression string = new Expression.Expression(Arrays.asList(stringString.split("")));
        ExpressionParser expressionParser = new ExpressionParser(string, OperatorFactory.getInstance());

//        expressionParser.isConstant("");

    }
}
