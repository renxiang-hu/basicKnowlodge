package designModel.Factory.simpleFactory1;

/**
 * 圆形实体类
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle : draw");
    }
}
