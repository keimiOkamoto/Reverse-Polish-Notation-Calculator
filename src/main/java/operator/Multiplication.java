package operator;

/**
 * Created by keimiokamoto on 11/10/2015.
 */
public class Multiplication implements Operator {

    private double val1;
    private double val2;


    public Multiplication(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override
    public double evaluate() {
        return val1 * val2;
    }
}
