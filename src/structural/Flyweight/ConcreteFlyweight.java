package structural.Flyweight;

// 具体享元
public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String state) {
        this.intrinsicState = state;
    }

    @Override
    public void operation() {
        System.out.println("具体享元，内部状态: " + intrinsicState);
    }
}
