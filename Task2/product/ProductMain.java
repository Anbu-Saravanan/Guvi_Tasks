package AssignmentPurpose.Task2.product;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Accept five products information from user
        Product[] productsArr = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product pid");
            int pid = scanner.nextInt();

            System.out.println("Enter product price");
            double price = scanner.nextDouble();

            System.out.println("Enter product Quantity");
            int quantity = scanner.nextInt();

            productsArr[i] = new Product(pid, price, quantity);
        }

        printProducts(productsArr);
        highestPrice(productsArr);
        calculateTotalAmount(productsArr);
    }
    //Printing products for  a test
    public static void printProducts(Product[] products){
        for (int j =0; j<products.length;j++){
            System.out.println("Product "+(j+1));
            System.out.println("PId "+ products[j].getPid());
            System.out.println("Price "+ products[j].getPrice());
            System.out.println("Quantity "+products[j].getQuantity());
            System.out.println("-------------");
        }
    }


    //Find the highest price of PID
    public static void highestPrice(Product[] products){
        double maxPrice = products[0].getPrice();
        int  maxPID = products[0].getPid();
       for(int i = 1; i < products.length;i++){
           if (products[i].getPrice()>maxPrice){
               maxPrice = products[i].getPrice();
               maxPID = products[i].getPid();
           }
        }
        System.out.println("Product with highest price:");
        System.out.println("PID: " + maxPID);
        System.out.println("Price: " + maxPrice);

    }


    public static void calculateTotalAmount(Product[] products){
        double totalAmount = 0;
        for (int i =0 ; i<products.length;i++){
            
            totalAmount += products[i].getPrice()*products[i].getQuantity();
            
            
        }
        System.out.println(" Total amount of all products is  : "+ totalAmount);

    }
}