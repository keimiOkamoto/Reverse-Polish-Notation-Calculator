import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by keimiokamoto on 18/10/2015.
 */
public class Evaluator {

    private Calculator calculator;
    private String expression;

    public Evaluator(Calculator calculator, String expression) {
        this.calculator = calculator;
        this.expression = expression;
    }

    public double evaluate() {
        List<String> expressionList = Arrays.asList(expression.split(""));
        double result = 0;

        for (int idx = 0; idx < expressionList.size(); idx++) {
            String token = expressionList.get(idx);
            if (isNumerical(token)) calculator.input(Double.parseDouble(token));
            try {
                if (token.equals("+")) calculator.add();
                if (token.equals("-")) calculator.subtract();
                if (token.equals("*")) calculator.product();
                if (token.equals("/")) calculator.divide();
            } catch (EmptyStackException ex) {
                if (!expressionList.isEmpty() && expressionList.get(idx + 1).equals(token)) result = (token.equals("+")) ? calculator.getResult() + 1 : calculator.getResult() -1;
            }
        }
        result = calculator.getResult();
        return result;
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
