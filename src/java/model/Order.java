package model;
import java.util.Date;
import java.util.List;
/*
 * Initial class for order to retrieve
 * from sql DB
 * uses a list of individual items which are in the order 
 * see /OrderItems
 */
public class Order {
    private int id;
    private int userId;
    private Date orderDate;
    private double total;
    private List<OrderItem> items;

    public Order() {
    }

    public Order(int id, int userId, Date orderDate, double total, List<OrderItem> items) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
        this.total = total;
        this.items = items;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    




}

