package com.ECommerce.Backend;

public class product{
    private int id;
    private String name;
    private String description;
    private double price;

    // Getter and Setter for id

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;

    }
    // Getter and Setter for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    // Getter and Setter for description
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    // Getter and Setter for price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
