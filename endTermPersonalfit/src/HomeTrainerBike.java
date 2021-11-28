import java.util.List;

public class HomeTrainerBike extends Bike{

    public HomeTrainerBike(String brand, String price, List<String> muscels, boolean electronicDis, String model) {
        super(brand, price, muscels, electronicDis, model);
    }

    @Override
    public String toString() {
        return "HomeTrainerBike{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
