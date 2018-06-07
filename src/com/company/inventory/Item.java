package com.company.inventory;

public class Item {

    private double price;
    private String itemName;
    private int quantity;
    private String dateReceived;

    public Item(double price, String itemName, int quantity, String dateReceived) {
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
        this.dateReceived = dateReceived;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDateReceived() {
        return dateReceived;
    }
    //date recieved cannot change

}
