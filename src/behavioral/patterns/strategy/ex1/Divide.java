package behavioral.patterns.strategy.ex1;

public class Divide implements Strategy {
    @Override
    public int action(int a, int b) {
        return a/b;
    }
}
