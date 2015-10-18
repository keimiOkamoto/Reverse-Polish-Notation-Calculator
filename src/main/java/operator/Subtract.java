package operator;

import operand.Token;

/**
 * Created by keimiokamoto on 10/10/2015.
 */
public class Subtract extends Token implements Operator {
    public Double apply(Double operand1, Double operand2) {
        return operand1 - operand2;
    }
}
