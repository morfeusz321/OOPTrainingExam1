import java.util.Objects;


public class ProteinShake extends Product{
    private String flavor;
    private String size;

    public ProteinShake(String brand, String price, String flavor, String size) {
        super(brand, price);
        this.flavor = flavor;
        this.size = size;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProteinShake)) return false;
        if (!super.equals(o)) return false;
        ProteinShake that = (ProteinShake) o;
        return Objects.equals(flavor, that.flavor) && Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flavor, size);
    }

    @Override
    public String toString() {
        return "ProteinShake{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", flavor='" + flavor + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
