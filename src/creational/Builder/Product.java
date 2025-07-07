package creational.Builder;

// 产品类
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) { this.partA = partA; }

    public void setPartB(String partB) { this.partB = partB; }

    public void setPartC(String partC) { this.partC = partC; }

    public void show() {
        System.out.println("产品由 " + partA + ", " + partB + ", " + partC + " 组成");
    }
}
