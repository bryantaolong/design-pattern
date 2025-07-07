package structural.Composite;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("根节点");
        root.add(new Leaf("叶子A"));
        root.add(new Leaf("叶子B"));

        Composite comp = new Composite("分支节点");
        comp.add(new Leaf("叶子C"));
        root.add(comp);

        root.display(1);
    }
}
