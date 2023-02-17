package designModel.Factory.factoryMethod;

public class Client {
    public static void main(String[] args) {
        Product productA = new FactoryA().createProduct();
        productA.doSomething();
        Product productB = new FactoryB().createProduct();
        productB.doSomething();
    }
}
