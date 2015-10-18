/**
 * Created by keimiokamoto on 18/10/2015.
 */
public class ReversePolishNotationCalculator implements Calculator {

    public ReversePolishNotationCalculator() {
    }

    @Override
    public double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    @Override
    public double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    @Override
    public double product(double operand1, double operand2) {
        return operand1 * operand2;
    }

    @Override
    public double divide(double operand1, double operand2) {
        return operand1 / operand2;
    }

    public double increment(double operand) {
        return operand + 1;
    }

    public double decrement(double operand) {
        return operand- 1;
    }
}
