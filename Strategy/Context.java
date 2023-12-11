import java.util.List;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 22024567.
     */
    public void sortStrategy(List<Integer> list) {
        strategy.sort(list);
    }
}
