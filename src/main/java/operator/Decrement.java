package operator;

/**
 * Created by keimiokamoto on 19/10/2015.
 */
public class Decrement implements UnaryOperator<Double> {
    @Override
    public Double apply(Double operand) {
        return operand - 1;
    }
}
