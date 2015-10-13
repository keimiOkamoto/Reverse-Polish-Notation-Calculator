import operator.Operator;
import operator.OperatorFactory;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by keimiokamoto on 12/10/2015.
 */
public class ReversePolishNotationCalculator implements Calculator {

    private Stack<Double> stack;
    private OperatorFactory operatorFactory;

    public ReversePolishNotationCalculator(OperatorFactory operatorFactory) {
        this.operatorFactory = operatorFactory;
        this.stack = new Stack<>();
    }

    @Override
    public double calculate(String expression) {
        Scanner scannerExpression = new Scanner(expression);

        while (scannerExpression.hasNext()) {
            String instruction = scannerExpression.next();

            if (instruction.equals("+") || instruction.equals("-") || instruction.equals("/") || instruction.equals("*")) {
                Double operand1 = stack.pop();
                Double operand2 = stack.pop();

                Operator operator = getOperatorBy(instruction);
                Double sum = operator.apply(operand1, operand2);

                stack.push(sum);
            } else stack.push(Double.parseDouble(instruction));
        }
        return stack.pop();
    }


    private Operator getOperatorBy(String instruction) {
        return operatorFactory.get(instruction);
    }
}
