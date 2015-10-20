package operand;

/**
 * Created by keimiokamoto on 17/10/2015.
 */
public class Constant implements Operand, Evaluable {
    private Double constant;

    public Constant(Double constant) {
        this.constant = constant;
    }

    public Double getConstant() {
        return constant;
    }
}
