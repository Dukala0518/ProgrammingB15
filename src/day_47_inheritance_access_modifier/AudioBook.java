package day_47_inheritance_access_modifier;

public class AudioBook extends Book{
    private int length;
    private String narrator;
    //Listening to Audio book written by author with title and narrated by narrator
    public void Listen(){
        System.out.println("I am listening Audio book written by "+getAuthor()+
                " with title of '"+getTitle()+ "' and narrated by "+narrator);

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
