import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by keimiokamoto on 19/10/2015.
 */
public class ReversePolishNotationCalculatorTest {
    private ReversePolishNotationCalculator reversePolishNotationCalculator;

    @Before
    public void buildUp() {
        reversePolishNotationCalculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldBeAbleToInputValuesToDataStructure() {
        reversePolishNotationCalculator.input(2.0);
        double actual = reversePolishNotationCalculator.getResult();
        double expected = 2.0;

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldBeAbleToAddValuesInDataStructure() {
        reversePolishNotationCalculator.input(2.0);
        reversePolishNotationCalculator.input(5.0);
        reversePolishNotationCalculator.add();

        double actual = reversePolishNotationCalculator.getResult();
        double expected = 7.0;

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldBeAbleToSubtractValuesInDataStructure() {
        reversePolishNotationCalculator.input(2.0);
        reversePolishNotationCalculator.input(5.0);
        reversePolishNotationCalculator.subtract();

        double actual = reversePolishNotationCalculator.getResult();
        double expected = 3.0;

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldBeAbleToMultiplyValuesInDataStructure() {
        reversePolishNotationCalculator.input(2.0);
        reversePolishNotationCalculator.input(5.0);
        reversePolishNotationCalculator.product();

        double actual = reversePolishNotationCalculator.getResult();
        double expected = 10.0;

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldBeAbleToDivideValuesInDataStructure() {
        reversePolishNotationCalculator.input(2.0);
        reversePolishNotationCalculator.input(10.0);
        reversePolishNotationCalculator.divide();

        double actual = reversePolishNotationCalculator.getResult();
        double expected = 5.0;

        assertThat(actual, is(equalTo(expected)));
    }
}
