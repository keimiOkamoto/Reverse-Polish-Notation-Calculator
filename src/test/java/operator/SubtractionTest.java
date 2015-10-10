package operator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by keimiokamoto on 10/10/2015.
 */
public class SubtractionTest {

    @Test
    public void shouldBeAbleToSubtractValues() {
        double val1 = 8;
        double val2 = 4;

        Subtraction subtraction = new Subtraction(val1, val2);
        double actual = subtraction.evaluate();
        double expected = val1 - val2;

        assertThat(expected, is(equalTo(actual)));
    }
}