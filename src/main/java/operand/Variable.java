package operand;

import java.util.Map;

/**
 * Created by keimiokamoto on 17/10/2015.
 */
public class Variable implements Operand, Evaluable {
    private Map<String, Double> variable;

    public Variable(Map<String, Double> variable) {
        this.variable = variable;
    }

    public Map<String, Double> getVariable() {
        return variable;
    }

    public void setVariable(Map<String, Double> variable) {
        this.variable = variable;
    }
}
