import operand.Token;

import java.util.Collection;

/**
 * Created by keimiokamoto on 18/10/2015.
 */
public interface Parser {
    Collection<Token> parse(String expression);
}
