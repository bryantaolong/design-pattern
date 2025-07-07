package structural.Decorator;

// 具体构件
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体构件的操作");
    }
}
