package designModel.Factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        new FactoryA().createProduct1().doSomething();
        new FactoryA().createProduct2().doSomething();
        new FactoryB().createProduct1().doSomething();
        new FactoryB().createProduct2().doSomething();
    }
}
