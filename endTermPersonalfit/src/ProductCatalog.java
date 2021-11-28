import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class ProductCatalog implements Runnable{
    private List<Product> products;

    public ProductCatalog() {
        products =new ArrayList<>();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductCatalog)) return false;
        ProductCatalog that = (ProductCatalog) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "products=" + products +
                '}';
    }
    public void addShake(Scanner scanner){
        System.out.println("Please enter the brand:");
        String brand=scanner.next();
        System.out.println("Please enter the price:");
        String price=scanner.next()+" euros";
        System.out.println("Please enter flavour:");
        String flavour=scanner.next();
        System.out.println("Please enter the size: ");
        String size=scanner.next()+ " grams";
        products.add(new ProteinShake(brand, price, flavour, size));
    }
    public synchronized void randomShake(){
        Random random=new Random();
        System.out.println(products.get(random.nextInt(products.size())));
    }
    public void searchMuscle(Scanner scanner){
        System.out.println("Please enter muscle group");
        String muscle= scanner.next();
        products.stream().filter(x->x instanceof Bike).map(product ->(Bike) product).filter(bike -> bike.getMuscels().stream().anyMatch(word->word.equals(muscle))).forEach(x->System.out.println(x));
    }
    public void writeFile() throws Exception{
        File file= new File("src/output.txt");
        file.createNewFile();
        PrintWriter writer= new PrintWriter(file);
        writer.write(this.toString());
        writer.flush();
        writer.close();

    }
    public void setInput(Scanner scanner) throws Exception{
        System.out.println("Please enter the name of a text file: ");
        String name=scanner.next();
        File file=new File("src/"+name+".txt");
        Scanner input=new Scanner(file);
        while(input.hasNext()){
            String line=input.nextLine();
            String[] temp=line.split("; ");
            if(temp[0].startsWith("HomeTrainerBike")){
                String[] cos=temp[0].split(" ");
                String brand= cos[cos.length-1];
                String[] pogo=temp[2].split(", ");
                List<String> muscles= Arrays.asList(pogo);
                this.products.add(new HomeTrainerBike(brand,temp[temp.length-1],muscles,temp[3].equals("TRUE"),temp[2]));
            }
            else if(temp[0].startsWith("SpinningBike")){
                String[] cos=temp[0].split(" ");
                String brand= cos[cos.length-1];
                String[] pogo=temp[2].split(", ");
                List<String> muscles= Arrays.asList(pogo);
                this.products.add(new SpinningBike(brand,temp[temp.length-1],muscles,temp[3].equals("TRUE"),temp[2],temp[4],temp[5]));
            }
            else{
                String[] cos=temp[0].split(" ");
                String brand= cos[cos.length-1];
                this.products.add(new ProteinShake(brand,temp[temp.length-1],temp[1],temp[2]));
            }
        }

    }

    @Override
    public void run() {
        this.randomShake();
    }
}
