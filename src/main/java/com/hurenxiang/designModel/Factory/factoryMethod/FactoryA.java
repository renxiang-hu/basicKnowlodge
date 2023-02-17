package designModel.Factory.factoryMethod;

public class FactoryA implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
