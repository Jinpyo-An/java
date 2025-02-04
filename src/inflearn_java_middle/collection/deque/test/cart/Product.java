package inflearn_java_middle.collection.deque.test.cart;

public class Product {

    private String name;
    private int price;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
