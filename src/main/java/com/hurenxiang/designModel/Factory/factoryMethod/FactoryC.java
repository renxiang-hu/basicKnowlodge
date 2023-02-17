package designModel.Factory.factoryMethod;

public class FactoryC implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new ProductC();
    }
}
