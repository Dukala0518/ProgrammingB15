package day_43_constructors_custom_class_list;

public class car {
    //Array, ArrayList of custom class
    private String model;
    private  double price;

    public car(String model, double price){
        this.model=model;
        this.price=price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
