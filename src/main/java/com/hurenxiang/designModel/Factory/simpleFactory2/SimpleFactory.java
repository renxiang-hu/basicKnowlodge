package designModel.Factory.simpleFactory2;

public class SimpleFactory {
    public static Product createProduct(String productName) {
        Product instance = null;
        switch (productName) {
            case "A":
                instance = new ProductA();
                break;
            case "B":
                instance = new ProductB();
                break;
            case "C":
                instance = new ProductC();
        }
        return instance;
    }
}
