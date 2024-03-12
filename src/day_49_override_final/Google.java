package day_49_override_final;

public class Google extends SearchEngine{
    @Override
    public int search(String item){
        System.out.println("Googling for..."+item);
        return item.length()*2;
    }
    public void getResult(){
        System.out.println("Search engine displaying result ... ");
    }

    protected String clickResult(){
        System.out.println("Clicking result of search Engine");
        return "SearchResult item detail ";
    }

}
