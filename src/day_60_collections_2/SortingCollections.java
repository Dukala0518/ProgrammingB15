package day_60_collections_2;
import java.util.*;
public class SortingCollections {
  //  WE CAN USE Collection.sort(list) TO SORT OUR LIST VALUES.
  public static void main(String[] args) {
      List<String>names=new ArrayList<>();
      names.add("Bill");
      names.add("Dukala");
      names.add("Erdemt");
      names.add("Enkhrii");

      System.out.println(names.toString());
      Collections.sort(names);
      System.out.println(names.toString());
      System.out.println("______");
      List<Product>productList=new ArrayList<>();
      productList.add(new Product("Apple",5.99));
      productList.add(new Product("Banana",0.69));
      productList.add(new Product("Grape",6.99));
      productList.add(new Product("Blueberry",4.99));
      productList.add(new Product("Egg",4.99));
      productList.add(new Product("Milk",3.99));
      productList.add(new Product("Sourdough",6.99));
      System.out.print(productList.toString());
      Collections.sort(productList);
      System.out.println();
      System.out.println(productList.toString());





  }


}
