package creational.Prototype;

// 原型接口
public interface Prototype extends Cloneable {
    Prototype clone();

    void show();
}
