public class Book {
    private String title;
    private double price;
    private int year_of_publication;
    private String authorsName;

    public Book(String title,double price,int year_of_publication,String authorsName){
        this.title=title;
        this.price=price;
        this.year_of_publication=year_of_publication;
        this.authorsName=authorsName;
    }
    //getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYear_of_publication() {
        return year_of_publication;
    }

    public String getAuthorsName() {
        return authorsName;
    }
    //setters

    public void setTitle(String title) { this.title = title; }

    public void setPrice(double price) { this.price = price; }

    public void setYear_of_publication(int year_of_publication) { this.year_of_publication = year_of_publication; }

    public void setAuthorsName(String authorsName) { this.authorsName = authorsName; }
}

