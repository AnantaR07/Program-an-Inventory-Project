package Iventory;

public class Product {

    public double getIventoryValue() {
        return IventoryValue;
    }

    public void setIventoryValue(double IventoryValue) {
        this.IventoryValue = IventoryValue;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public int getItem_number() {
        return item_number;
    }
    
    public void setItem_number(int item_number) {
        this.item_number = item_number;
    }

    public String getThe_name_of_the_product() {
        return the_name_of_the_product;
    }

    public void setThe_name_of_the_product(String the_name_of_the_product) {
        this.the_name_of_the_product = the_name_of_the_product;
    }

    public int getThe_number_of_units_in_stock() {
        return the_number_of_units_in_stock;
    }

    public void setThe_number_of_units_in_stock(int the_number_of_units_in_stock) {
        this.the_number_of_units_in_stock = the_number_of_units_in_stock;
    }

    public double getThe_price_of_each_unit() {
        return the_price_of_each_unit;
    }

    public void setThe_price_of_each_unit(double the_price_of_each_unit) {
        this.the_price_of_each_unit = the_price_of_each_unit;
    }

  private int item_number;
  private String the_name_of_the_product;
  private int the_number_of_units_in_stock;
  private double the_price_of_each_unit;
  private boolean value=true;
  private double IventoryValue;
  
  //Instance field declarations
    Product(){
        // default constructor 
    } 
    
    public Product(int item_number,String the_name_of_the_product,int the_number_of_units_in_stock,double the_price_of_each_unit,double IventoryValue){
      this.item_number = item_number;
      this.the_name_of_the_product = the_name_of_the_product;
      this.the_number_of_units_in_stock = the_number_of_units_in_stock;
      this.the_price_of_each_unit = the_price_of_each_unit;  
      this.IventoryValue = IventoryValue;
    } 
    
     @Override
    public String toString(){
        String viewProduk;
        viewProduk =   "\nItem Number       : "+getItem_number()+
                       "\nName              : "+getThe_name_of_the_product()+
                       "\nQuantity in stock : "+getThe_number_of_units_in_stock()+
                       "\nPrice             : "+getThe_price_of_each_unit()+" USD"+
                       "\nStock Value       : "+String.format("%.2f", getIventoryValue())+
                       "\nProduct Status    : Active ("+isValue()+")";
        return viewProduk;        
    }
        public String toString2(){
        String viewProduk;
        viewProduk =   "\nItem Number       : "+getItem_number()+
                       "\nName              : "+getThe_name_of_the_product()+
                       "\nQuantity in stock : "+getThe_number_of_units_in_stock()+
                       "\nPrice             : "+getThe_price_of_each_unit()+" USD"+
                       "\nStock Value       : "+String.format("%.2f", getIventoryValue())+
                       "\nProduct Status    : Discontinued ("+isValue()+")";
        return viewProduk;        
    }
}
