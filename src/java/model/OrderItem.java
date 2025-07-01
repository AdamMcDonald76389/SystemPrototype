package model;

public class OrderItem {
    int id;
    int orderId;
    String isbn;
    int quantity;
    double price;

    public OrderItem() {
    }

    public OrderItem(int id, int orderId, String isbn, int quantity, double price) {
        this.id = id;
        this.orderId = orderId;
        this.isbn = isbn;
        this.quantity = quantity;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setBookIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}    
