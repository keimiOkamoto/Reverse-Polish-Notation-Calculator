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

    public Operator get(String instruction) {
        if (instruction.equals("+")) return new Add();
        if (instruction.equals("-")) return new Subtract();
        if (instruction.equals("*")) return new Multiply();
        if (instruction.equals("/")) return new Divide();
        return null;
    }
}
