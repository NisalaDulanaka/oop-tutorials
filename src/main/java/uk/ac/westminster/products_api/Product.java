package uk.ac.westminster.products_api;

public class Product {
    private long id;
    private String name;
    private double price;

    public Product() {}

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // without the getter methods the private fields will not be visible in the response body
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
