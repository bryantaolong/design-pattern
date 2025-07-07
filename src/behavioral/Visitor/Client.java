package behavioral.Visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ElementA());
        os.add(new ElementB());
        Visitor visitor = new ConcreteVisitor();
        os.accept(visitor);
    }
}
