import operand.Operand;
import operand.OperandFactory;
import operand.Token;
import operator.Operator;
import operator.OperatorFactory;

import java.util.*;

/**
 * Created by keimiokamoto on 18/10/2015.
 */
public class ExpressionParser implements Parser {
    private List<Token> tokens;
    private OperatorFactory operatorFactory;
    private OperandFactory operandFactory;

    public ExpressionParser(OperatorFactory operatorFactory, OperandFactory operandFactory) {
        this.operatorFactory = operatorFactory;
        this.operandFactory = operandFactory;
        this.tokens = new ArrayList<>();
    }

    @Override
    public Collection<Token> parse(String expression) {
        List<String> expressionList = Arrays.asList(expression.split(""));
        for (String token : expressionList) {
            if (isOperand(token)) tokens.add((Token)getOperand(token));
            else tokens.add((Token)getOperator(token));
        }
        return tokens;
    }

    private boolean isOperand(String instruction) {
        return (!instruction.equals("+") || !instruction.equals("-") || !instruction.equals("/") || !instruction.equals("*"));
    }

    private Operator getOperator(String instruction) {
        return operatorFactory.get(instruction);
    }

    private Operand getOperand(String instruction) {
        return operandFactory.get(instruction);
    }

}
