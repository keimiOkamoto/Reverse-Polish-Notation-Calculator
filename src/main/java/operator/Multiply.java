package operator;

/**
 * Created by keimiokamoto on 11/10/2015.
 */
public class Multiply extends Token implements Operator {

    @Override
    public Double apply(Double operand1, Double operand2) {
        return operand1 * operand2;
    }
}
