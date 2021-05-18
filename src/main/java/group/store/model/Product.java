package group.store.model;

public class Product {

    private final int price;
    private  final String name;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}