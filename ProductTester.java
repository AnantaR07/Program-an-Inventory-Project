package Iventory;
import java.util.Scanner;
public class ProductTester {
    
    ProductTester(){
    String movie1,movie2;
    
    Product p1 = new Product();
    p1.setItem_number(1);
    p1.setThe_name_of_the_product("Kimi No Nawa");
    p1.setThe_number_of_units_in_stock(20);
    p1.setThe_price_of_each_unit(36.12);
    p1.setIventoryValue(20*36.12);
    System.out.println(p1.toString());
    
    Product p2 = new Product();
    p2.setItem_number(2);
    p2.setThe_name_of_the_product("Love, Chunibyo & Other Delusions: Take on Me");
    p2.setThe_number_of_units_in_stock(10);
    p2.setThe_price_of_each_unit(28.87);
    p2.setIventoryValue(10*28.87);
    System.out.println(p2.toString());
    }
    
    ProductTester(String movie2,String movie4,String movie5,String movie6){
    
    Product p3 = new Product();
    p3.setItem_number(3);
    p3.setThe_name_of_the_product("Kamen Rider Heisei Final Generation");
    p3.setThe_number_of_units_in_stock(20);
    p3.setThe_price_of_each_unit(32.12);
    p3.setIventoryValue(20*32.12);
    System.out.println(p3.toString());
      
    Product p4 = new Product(); 
    p4.setItem_number(4);
    p4.setThe_name_of_the_product("Kamen Rider Heisei Final Generation");
    p4.setThe_number_of_units_in_stock(20);
    p4.setThe_price_of_each_unit(32.12);
    p4.setIventoryValue(20*32.12);
    System.out.println(p4.toString());
    
    Product p5 = new Product(); 
    p5.setItem_number(5);
    p5.setThe_name_of_the_product("Hello World");
    p5.setThe_number_of_units_in_stock(45);
    p5.setThe_price_of_each_unit(23.88);
    p5.setIventoryValue(45*23.88);
    System.out.println(p5.toString());
    
    Product p6 = new Product(); 
    p6.setItem_number(6);
    p6.setThe_name_of_the_product("Tenki No Ko");
    p6.setThe_number_of_units_in_stock(0);
    p6.setThe_price_of_each_unit(32.76);
    p6.setIventoryValue(0*32.76);
    p6.setValue(false);
    System.out.println(p6.toString2());
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Number;
        String Name;
        int Qty;
        double Price;
        double StockValue;
        int maxSize=5;
       
        System.out.println("|===DAFTAR DVD MOVIE===|");
           new ProductTester();
           new ProductTester("movie2","movie3","movie4","movie5");
        
        
        System.out.println("\n");
        System.out.println("===================================================\nEnter the number of products you would like to add\n" +
                            "Enter 0 (zero) if you do not wish to add products:\n===================================================");
       
        Product p1 = new Product();
        System.out.println("\n");
        while(0<5){
        System.out.println("=============================================");
        System.out.print("Input Number product   = ");
        Number = input.nextInt();
        p1.setItem_number(Number);
        if(Number == 0){
            System.out.print("Incorrect Value entered");
            break;
           }else if (Number != 0){
            System.out.print("Imput name product     = ");
            Name = input.next();
            p1.setThe_name_of_the_product(Name);
            System.out.print("Input Quantity product = ");
            Qty = input.nextInt();
            p1.setThe_number_of_units_in_stock(Qty);
            System.out.print("Input Price product    = ");
            Price = input.nextDouble();
            p1.setThe_price_of_each_unit(Price);
            System.out.println(p1.toString());
           }
        }
        
        Product p2 = new Product();
        System.out.println("\n");
        while(0<5){
        System.out.println("=============================================");
        System.out.print("Input Number product   = ");
        Number = input.nextInt();
        p2.setItem_number(Number);
        if(Number == 0){
            System.out.println("Incorrect Value entered");
            System.out.println("No product required");
            break;
           }else if (Number != 0){   
            System.out.print("Imput name product     = ");
            Name = input.next();
            p2.setThe_name_of_the_product(Name);
            System.out.print("Input Quantity product = ");
            Qty = input.nextInt();
            p2.setThe_number_of_units_in_stock(Qty);
            System.out.print("Input Price product    = ");
            Price = input.nextDouble();
            p2.setThe_price_of_each_unit(Price);
            System.out.println(p2.toString());
        }
    }        
}
}

