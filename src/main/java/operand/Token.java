package operand;

/**
 * Created by keimiokamoto on 18/10/2015.
 */
public abstract class Token<T> {

    private T t;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
