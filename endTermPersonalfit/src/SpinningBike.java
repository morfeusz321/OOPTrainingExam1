import java.util.List;
import java.util.Objects;

public class SpinningBike extends Bike{
    private String weight;
    private String mechanisem;


    public SpinningBike(String brand, String price, List<String> muscels, boolean electronicDis, String model, String weight, String mechanisem) {
        super(brand, price, muscels, electronicDis, model);
        this.weight = weight;
        this.mechanisem = mechanisem;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpinningBike)) return false;
        if (!super.equals(o)) return false;
        SpinningBike that = (SpinningBike) o;
        return Objects.equals(weight, that.weight) && Objects.equals(mechanisem, that.mechanisem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, mechanisem);
    }

    @Override
    public String toString() {
        return "SpinningBike{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", weight='" + weight + '\'' +
                ", mechanisem='" + mechanisem + '\'' +
                '}';
    }
}
