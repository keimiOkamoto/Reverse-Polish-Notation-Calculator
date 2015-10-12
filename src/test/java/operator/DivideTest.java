package operator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


/**
 * Created by keimiokamoto on 11/10/2015.
 */
public class DivideTest {
    @Test
    public void shouldBeAbleToDivideValues() {
        double val1 = 20;
        double val2 = 5;

        Divide divide = new Divide(val1, val2);
        double actual = divide.apply();
        double expected = val1 / val2;

        assertThat(expected, is(equalTo(actual)));
    }

}
