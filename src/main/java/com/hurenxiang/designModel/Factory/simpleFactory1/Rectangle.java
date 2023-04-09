package designModel.Factory.simpleFactory1;

/**
 * 矩形实体类
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle : draw");
    }
}
