package operator;

/**
 * Created by keimiokamoto on 10/10/2015.
 */
public class Add implements Operator {
    private double val1;
    private double val2;

    public Add(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public double apply() {
        return val1 + val2;
    }
}
