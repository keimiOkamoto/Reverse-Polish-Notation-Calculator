package operand;

/**
 * Created by keimiokamoto on 17/10/2015.
 */
public class Constant extends Token implements Operand {
    private Double constant;

    public Constant(Double constant) {
        this.constant = constant;
    }

    public Double getConstant() {
        return constant;
    }

    public void setConstant(Double constant) {
        this.constant = constant;
    }
}
