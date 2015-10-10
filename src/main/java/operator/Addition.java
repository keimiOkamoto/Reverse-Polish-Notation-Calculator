package operator;

/**
 * Created by keimiokamoto on 10/10/2015.
 */
public class Addition implements Operator {
    double val1;
    double val2;

    public Addition(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public double evaluate() {
        return val1 + val2;
    }
}
