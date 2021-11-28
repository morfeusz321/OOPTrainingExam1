import java.util.Objects;

public abstract class Product {
    String brand;
    String price;

    /**
     * Constructes an instance of Product(not really the product but its child classes)
     * @param brand  name of the brand
     * @param price price of the product
     */
    public Product(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(brand, product.brand) && Objects.equals(price, product.price);
    }

    /**
     * Makes a String format out of Product
     * @return String format of the Product
     */
    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
