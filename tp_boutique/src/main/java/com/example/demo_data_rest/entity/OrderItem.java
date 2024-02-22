package com.example.demo_data_rest.entity;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candy_id")
    private Candy candy;

    @ManyToOne
    @JoinColumn(name= "order_id")
    private Order order;
    private int quantity;

    public OrderItem(Long id, Candy candy, int quantity) {
        this.id = id;
        this.candy = candy;
        this.quantity = quantity;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Candy getCandy() {
        return candy;
    }

    public void setCandy(Candy candy) {
        this.candy = candy;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
