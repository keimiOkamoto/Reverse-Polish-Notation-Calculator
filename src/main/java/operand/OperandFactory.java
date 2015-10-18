package operand;

/**
 * Created by keimiokamoto on 18/10/2015.
 */
public class OperandFactory {
    private static OperandFactory operandFactory = null;

    private OperandFactory() {
    }

    public static OperandFactory getInstance() {
        if (operandFactory == null) return operandFactory = new OperandFactory();
        else return operandFactory;
    }

    public Operand get(String instruction) {
        if(isNumber(instruction)) return new Constant(Double.parseDouble(instruction));
        else return new Variable(instruction);
    }

    private boolean isNumber(String instruction) {
        try {
            Double.parseDouble(instruction);
            return true;
        } catch (NumberFormatException ex) {
            ex.getMessage();
            return false;
        }
    }
}
