package operator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by keimiokamoto on 10/10/2015.
 */
public class AddTest {

    @Test
    public void shouldBeAbleToAddValues() {
        double val1 = 5;
        double val2 = 6;

        Add add = new Add(val1, val2);
        double actual = add.apply();
        double expected = val1 + val2;

        assertThat(expected, is(equalTo(actual)));
    }
}
