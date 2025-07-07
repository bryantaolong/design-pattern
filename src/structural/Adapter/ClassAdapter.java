package structural.Adapter;

// 类适配器（使用继承）
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
