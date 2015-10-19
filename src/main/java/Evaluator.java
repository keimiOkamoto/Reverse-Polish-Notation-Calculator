import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.IllegalFormatException;
import java.util.List;

/**
 * Created by keimiokamoto on 18/10/2015.
 */
public class Evaluator {

    private double result;
    private Calculator calculator;
    private String expression;

    public Evaluator(Calculator calculator, String expression) {
        this.calculator = calculator;
        this.expression = expression;
    }

    public double evaluate() throws IllegalFormatException {
        List<String> expressionList = Arrays.asList(expression.split(""));

        for (int idx = 0; idx < expressionList.size() - 1; idx++) {
            String token = expressionList.get(idx);

            if (isNumerical(token)) calculator.input(Double.parseDouble(token));
            else
                try {
                    operate(token);
                } catch (EmptyStackException ex) {
                    System.out.println("Not enough operands to perform binary operation. " + ex.getMessage());
                } finally {
                    if (!expressionList.isEmpty() && token.equals(expressionList.get(idx + 1)))
                        result = (token.equals("+")) ? calculator.getResult() + 1 : calculator.getResult() -1;
                }
        }
        result = calculator.getResult();
        return result;
    }

    public double getResult() throws IllegalFormatException {
        return calculator.getResult();
    }

    private void operate(String token) {
        if (token.equals("+")) calculator.add();
        if (token.equals("-")) calculator.subtract();
        if (token.equals("*")) calculator.product();
        if (token.equals("/")) calculator.divide();
    }

    private boolean isNumerical(String op) {
        try {
            Double.parseDouble(op);
            return true;
        } catch (NumberFormatException ex) {
            ex.getMessage();
            return false;
        }
    }
}
