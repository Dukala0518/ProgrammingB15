package day_60_collections_2;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private  String product;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Double.compare(price, product1.price) == 0 && Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price);
    }

    public Product(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
/*this method returns an int of 3types:
1.positive number-->this product is larger than anotherProduct
2.zero 0-->this product and anotherProduct are equal
3.negative number-->this product is smaller than anotherProduct
*/

    @Override
    public int compareTo(Product anotherProduct) {
        if (this.price > anotherProduct.price) {
            return 1;
        } else if (this.price == anotherProduct.price) {
            return 0;
        } else {
            return -1;
        }

        }

}
