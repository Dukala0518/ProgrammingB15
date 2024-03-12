package day_49_override_final;

public class SearchEngine {

    public int search(String item){
        System.out.println("Searching for..."+item);
        return item.length();
    }
    protected void getResult(){
        System.out.println("Search engine displaying result ... ");
    }

    String clickResult(){
        System.out.println("Clicking result of search Engine");
        return "SearchResult item detail ";
    }

}
