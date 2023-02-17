package designModel.Factory.simpleFactory2;

public class FactoryDemo {
    public static void main(String[] args) {
        SimpleFactory.createProduct("A").doSomething();
        SimpleFactory.createProduct("B").doSomething();
    }
}
