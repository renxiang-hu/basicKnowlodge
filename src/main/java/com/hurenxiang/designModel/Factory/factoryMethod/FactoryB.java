package designModel.Factory.factoryMethod;

public class FactoryB implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
