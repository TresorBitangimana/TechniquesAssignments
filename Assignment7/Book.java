package Assignment7;

public class Book {
    
    private String title;
    private String author;
    private double price;
    private int pages;
    private boolean isDigital;

    public Book(String title, String author, double price, int pages, boolean digital){
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.isDigital = digital;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public boolean isDigital() {
        return isDigital;
    }

    @Override
    public String toString() {
        return "Title: "+title+"\nAuthor: "+author+"Price: "+price+"\nPages: "+pages+" Digital: "+ isDigital;
    }
}
