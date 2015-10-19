package operator;

/**
 * Created by keimiokamoto on 19/10/2015.
 */
public interface BinaryOperator<T> extends Operator<T> {
    Double apply(Double operand1, Double operand2);
}
