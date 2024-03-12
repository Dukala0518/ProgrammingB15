package day_40_custom_method_oop;

public class Product {

    //properties of the product.We declare them in the class and outside any method.
    String title;
    double price;
    int rating;
    String seller;

    //create a behavior--custom method is act as behavior for Product class
    public void displayInfo(){
        System.out.println("---Product info---");
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Rating: "+rating);
        System.out.println("Seller: "+seller);

    }


    //How do you create object from Product class?
    //We use NEW keyword, to create an object from class.
    // syntax:
    //Classname varName=new ClassName();
    //Product prod1= new Product();
    //How do you assign values to variables in the object.
    //varName.variableNameFromClass=value;
    //prod1.title="Wooden Spoon";
    //prod1.price=12.99;
    //prod1.rating=5;
    //prod.seller="Memento";
    //we can add main method in sama class and create object
    public static void main(String[] args) {
        //create object from Product class
        Product prod1=new Product();
        //assign values to variables in the object
        prod1.title="Wooden Spoon";
        prod1.price=12.99;
        prod1.rating=5;
        prod1.seller="Memento";

        //How to read values from object?
        System.out.println(prod1.title);
        System.out.println(prod1.price);
        System.out.println(prod1.rating);
        System.out.println(prod1.seller);

    }


}
