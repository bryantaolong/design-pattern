package behavioral.State;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request(); // A->B
        context.request(); // B->A
        context.request(); // A->B
    }
}
