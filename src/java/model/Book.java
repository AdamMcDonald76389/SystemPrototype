package model;
/*
 * 
 * generic catch all class for books to be used throughout
 * the backend
 * fields exist to be changed by database queries
 * contains various getters and setters to be used 
 * throughout other files
 * subject to change
 */
public class Book {

    private String isbn;
    private String title;
    private String author;
    private String genre;
    private double price;
    private String imageUrl;

    
    

    public Book(String isbn, String title, String author, String genre, double price, String imageUrl) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.imageUrl = imageUrl;

    }

    public Book() {

    }
    
    public String getIsbn() {
        return isbn;
    }

    

    public void updateId(String newIsbn) {
        this.isbn = newIsbn;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
