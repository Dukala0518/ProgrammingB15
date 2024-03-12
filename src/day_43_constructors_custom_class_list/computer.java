package day_43_constructors_custom_class_list;

public class computer {
   private String brand;
   private double price;
   private String os; //os stands for operating system

    public computer(){
        System.out.println("computer no-Args constructor");
        brand="unknown brand";
        os="unknown os";
        //price=0;
    }
    public computer(String brand, double price, String os){
        System.out.println(brand+"|"+price+"|"+os);
        this.brand=brand;
        this.price=price;
        this.os=os;

    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String toString() {
        return "computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", os='" + os + '\'' +
                '}';
    }
}

