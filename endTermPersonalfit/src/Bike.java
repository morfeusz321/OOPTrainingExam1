import java.util.List;
import java.util.Objects;

public abstract class Bike extends Product{
    private List<String> muscels;
    private boolean electronicDis;
    private String model;

    public Bike(String brand, String price, List<String> muscels, boolean electronicDis, String model) {
        super(brand, price);
        this.muscels = muscels;
        this.electronicDis = electronicDis;
        this.model = model;
    }

    /**
     * Return the muscles this bike trains
     * @return List of muscles
     */
    public List<String> getMuscels() {
        return muscels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike)) return false;
        if (!super.equals(o)) return false;
        Bike bike = (Bike) o;
        return electronicDis == bike.electronicDis && Objects.equals(muscels, bike.muscels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), muscels, electronicDis);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "muscels=" + muscels +
                ", electronicDis=" + electronicDis +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}
