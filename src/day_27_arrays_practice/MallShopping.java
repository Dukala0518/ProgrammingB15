package day_27_arrays_practice;

public class MallShopping {
    public static void main(String[] args) {
        String[] items={"Shoes","Jacket","Gloves","Airpods","ipad","iPhone case"};
        double[] prices={99.99,150.0,9.99,250.0,439.50,12.99};
        int[] itemID={12345, 12346,12347,12348,123459,12349};
//Receipt Report
        double totalPrice=0.0;
        for(int i=0;i<items.length;i++){
            System.out.println(items[i]+"- $"+prices[i]+"-"+itemID[i]);
            totalPrice=totalPrice+prices[i];
        }
        totalPrice=totalPrice*1.06;
        System.out.println("Total Price:$"+ (int)totalPrice);
        for(int i=0;i<items.length;i++){
            if(items[i].equals("Airpods")){
                System.out.println(itemID[i]+items[i]+prices[i]);
                break;

            }
        } double mostExpensive=prices[0];
        int Index=-1;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>mostExpensive){
                mostExpensive=prices[i];
                Index=i;

            }


        } System.out.println("Most Expensive:"+items[Index]);


        }

    }

