package designModel.Factory.simpleFactory1;

public class ShapeFactory {

    public static final String CIRCLE = "circle";

    public static final String RECTANGLE = "rectangle";

    public static final String SQUARE = "square";

    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        switch (shapeType) {
            case CIRCLE :
                return new Circle();
            case RECTANGLE :
                return new Rectangle();
            case SQUARE :
                return new Square();
            default:
                return null;
        }
    }
}
