import operator.OperatorFactory;
import org.junit.Test;

import java.lang.*;
import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


/**
 * Created by keimiokamoto on 12/10/2015.
 */
public class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldBeAbleToCalculateValues() {
        String expression = "3 5 +";

        Calculator calculator = new ReversePolishNotationCalculator(new OperatorFactory());
        double actual = calculator.calculate(expression);
        double expected = 8;

        assertThat(actual, is(equalTo(expected)));
    }
}
