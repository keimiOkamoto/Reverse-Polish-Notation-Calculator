package operator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by keimiokamoto on 10/10/2015.
 */
public class SubtractTest {

    @Test
    public void shouldBeAbleToSubtractValues() {
        double val1 = 8;
        double val2 = 4;

        Subtract subtract = new Subtract();
        double actual = subtract.apply(val1, val2);
        double expected = val1 - val2;

        assertThat(expected, is(equalTo(actual)));
    }
}