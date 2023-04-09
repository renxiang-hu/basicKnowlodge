package designModel.Factory.simpleFactory1;

/**
 * 正方形实体类
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square : draw");
    }
}
