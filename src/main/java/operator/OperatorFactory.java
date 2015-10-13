package operator;

/**
 * Created by keimiokamoto on 13/10/2015.
 */
public class OperatorFactory {

    public Operator get(String instruction) {
        if (instruction.equals("+")) return new Add();
        if (instruction.equals("-")) return new Subtract();
        if (instruction.equals("*")) return new Multiply();
        if (instruction.equals("/")) return new Divide();
        return null;
    }
}
