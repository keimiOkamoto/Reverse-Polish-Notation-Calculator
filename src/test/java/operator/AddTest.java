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

        Add add = new Add();
        double actual = add.apply(val1, val2);
        double expected = val1 + val2;

        assertThat(actual, is(equalTo(expected)));
    }
}
