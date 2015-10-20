import operator.*;

/**
 * Created by keimiokamoto on 13/10/2015.
 */
public class OperatorFactory {
    private static OperatorFactory operatorFactory = null;

    private OperatorFactory() {
    }

    public static OperatorFactory getInstance() {
        if (operatorFactory == null) return operatorFactory = new OperatorFactory();
        else return operatorFactory;
    }

    public Operator get(String operator) {
        if (operator.equals("+")) return new Add();
        if (operator.equals("-")) return new Subtract();
        if (operator.equals("*")) return new Multiply();
        if (operator.equals("/")) return new Divide();
        return null;
    }
}
