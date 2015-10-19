/**
 * Created by keimiokamoto on 19/10/2015.
 */
public class User {

    public static void main(String[] args) {
        Calculator calculator = new ReversePolishNotationCalculator();

        String expression = "512+4×+3−";
        Evaluator evaluator = new Evaluator(calculator, expression);

        double result = evaluator.evaluate();
        System.out.println("Result is: " + result);

    }
}
