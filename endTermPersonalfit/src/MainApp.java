import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws Exception{
        ProductCatalog oop=new ProductCatalog();
        Scanner scanner=new Scanner(System.in);
        oop.setInput(scanner);
        boolean isOn=true;
        Scanner input=new Scanner(System.in);
        while(isOn){
            System.out.println("1 – Print all bikes & protein shakes\n" +
                    "2 – Add a new protein shake\n" +
                    "3 – Propose a random protein shake to the customer\n" +
                    "4 – Show bikes that train a specific muscle group\n" +
                    "5 – Write to file\n" +
                    "6 – Stop the program");
            switch (input.nextInt()){
                case 1:
                    System.out.println(oop.toString());
                    break;
                case 2:
                    Scanner scanner1=new Scanner(System.in);
                    oop.addShake(scanner1);
                    break;
                case 3:
                    Thread t=new Thread(oop);
                    t.start();
                    break;
                case 4:
                    Scanner scanner2=new Scanner(System.in);
                    oop.searchMuscle(scanner2);
                    break;
                case 5:
                    oop.writeFile();
                    break;
                case 6:
                    isOn=false;
                    break;
                default:
                    System.out.println("Please enter the number between 0 and 6");
            }
        }
    }
}
