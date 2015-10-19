package operator;

/**
 * Created by keimiokamoto on 10/10/2015.
 */
public class Subtract implements BinaryOperator<Double> {
    public Double apply(Double operand1, Double operand2) {
        return operand1 - operand2;
    }
}
