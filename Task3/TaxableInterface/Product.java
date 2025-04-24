package AssignmentPurpose.Task3.TaxableInterface;

public class Product implements Taxable{
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price= price;
        this.quantity= quantity;
    }

    @Override
    public double calcTax() {
        double unitPrice = quantity * price;
        return unitPrice* salesTax /100;
    }

    //Optional for printing data to test
    public void display(){
        System.out.println("Product id is "+pid);
        System.out.println("Product price is "+ price);
        System.out.println("Product quantity is "+quantity);
    }

}
