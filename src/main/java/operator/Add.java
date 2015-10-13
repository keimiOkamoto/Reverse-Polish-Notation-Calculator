package operator;

/**
 * Created by keimiokamoto on 10/10/2015.
 */
public class Add implements Operator {

    public Double apply(Double operator1, Double operator2) {
        return operator1 + operator2;
    }
}
