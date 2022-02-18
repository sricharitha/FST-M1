package activities;

abstract class Book{
    String title;
    abstract void setTitle(String s);

    public String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    public void setTitle(String s){
        title = s;
    }
}

public class Activity5 {
    public static void main(String[] args) {
        String title = "Number the stars";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("The title of the novel: " + newNovel.getTitle());
    }
}
