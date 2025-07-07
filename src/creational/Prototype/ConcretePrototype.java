package creational.Prototype;

// 具体原型类
public class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    @Override
    public void show() {
        System.out.println("原型实例，名字: " + name);
    }
}
