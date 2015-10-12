import org.junit.Test;

import java.util.Stack;

/**
 * Created by keimiokamoto on 12/10/2015.
 */
public class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldBeAbleToCalculateValues() {
        double val1 = 5;
        double val2 = 3;

        Stack<Double> stack = new Stack<>();

        Calculator calculator = new ReversePolishNotationCalculator();
        calculator.calculate(new Expression());
    }
}
