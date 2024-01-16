package com.biritas.userdept.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private int quantity;
    private double costPrice;
    private double sellPrice;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product() {

    }

    public Product(UUID id, String name, int quantity, double costPrice, double sellPrice, Category category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
