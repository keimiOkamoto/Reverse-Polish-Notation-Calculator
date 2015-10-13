package operator;

/**
 * Created by keimiokamoto on 12/10/2015.
 */
public class Divide implements Operator {

    @Override
    public Double apply(Double operand1, Double operand2) {
        return operand1 / operand2;
    }
}
