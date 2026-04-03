package creational.Prototype;

/**
 * 原型接口
 *
 * @author: Bryan Long
 */
public interface Prototype extends Cloneable {
    Prototype clone();

    void show();
}
