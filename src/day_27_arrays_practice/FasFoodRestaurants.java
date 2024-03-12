package day_27_arrays_practice;

public class FasFoodRestaurants {
    public static void main(String[] args) {
        String []restaurants={"324 Main St, Massena, McDonald's, 13662, NY",
        "105 Business Loop W,Jamestown, Taco Bell, 58401,ND",
        "3022 5th Ave S, Fort Dodge, Jimmy Johns, 50501, IA", "324 Main St, Massena, McDonald's, 13662, NY"};
        //find out how many restaurants and print them.
        System.out.println("how many restaurants: "+restaurants.length);
        //Print each restaurant with numbers
      for(int i=0; i<restaurants.length;i++){
          System.out.println(i+1+"."+restaurants[i]);
      } //Count how many Mc.Donald's
        int mcDonaldsCount=0;
      for(int i=0;i<restaurants.length;i++){
          if(restaurants[i].contains("McDonald's")){
              mcDonaldsCount=mcDonaldsCount;
          }
      } System.out.println(mcDonaldsCount);
      //count ou mc.donalds and jimmy johns
        int mcDonalsCount=0;
        int jimmyJOhnCount=0;
        for(int i=0; i< restaurants.length;i++){
            if(restaurants[i].contains("McDonald's")){
                mcDonalsCount++;
            } else if(restaurants[i].contains("Jimmy John")){
                jimmyJOhnCount++;
            }
        }
        System.out.println("mcDonol'sCount = " + mcDonalsCount);
        System.out.println("jimmyJOhnCount = " + jimmyJOhnCount);
        String str=restaurants[0];
        String []strArr=str.split(",");
        System.out.println(strArr[2]+"-->"+strArr[1]+","+strArr[4]);
        //String [] Arrays=new String[] ;
        for(int i=0;i< restaurants.length;i++){
           String [] rs= restaurants[i].split(",");
            System.out.println(rs[2]+"-->"+rs[1]+","+rs[4]);

}
    }
}
