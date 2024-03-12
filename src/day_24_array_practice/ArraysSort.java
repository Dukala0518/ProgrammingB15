package day_24_array_practice;
import java.util.Arrays;
public class ArraysSort {
    public static void main(String[] args) {
        //Arrays.sort
        //is used to sort array in ascending order.
        // for ex: 22,33,11------>>11,22,33
        //String:  "one" "two" "Three"-----> one,three,two(alphabetically)
        //Sort method modify(change) the array indexes.

        int [] num={56,567,88,446,778,99,11,33,44,55,66,77,888,-7};
        System.out.println("before sorting:"+Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("after sorting:"+Arrays.toString(num));
        String [] names={"Dukala,1Seke,Dulguun,Seke,1Oojii"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        String []words={"Apple", "bananas","cherries"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

    }
}
