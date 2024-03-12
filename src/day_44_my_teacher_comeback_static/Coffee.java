package day_44_my_teacher_comeback_static;

public class Coffee {
    //data/fields:
   private String name;
   private String size;
   private  double price;


   public Coffee(){
       this.name="undecided";
       this.size="not sure";
       this.price=0;
   }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
       if(size.equals("tall")||size.equals("grande")||size.equals("venti")){
           this.size=size;
       }else{
           System.out.println("Error Invalid size");
           this.size="unknown";
       }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public Coffee(String name, String size, double price){
       this.name=name;
       this.setSize(size);
       this.price=price;
   }
  //instance method(we use instance variables)
   public void drink(){
       System.out.println("Drinking "+size+" "+name+" that I bought for $"+price);
   }

}
