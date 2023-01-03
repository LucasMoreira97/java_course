package entities;

import java.sql.Date;

public class Order {

    private Date date;
    private Product product;

    public Order(Date date, Product product) {
        this.date = date;
        this.product = product;
        this.product.name = "TV";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    
}
