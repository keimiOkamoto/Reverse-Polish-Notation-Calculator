package operand;

/**
 * Created by keimiokamoto on 17/10/2015.
 */
public class Variable extends Token implements Operand {
    private String variable;


    public Variable(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
}
