package com.company.inventory;

public class Souvenir extends Item {

    private String type;
    private int idNumber;
    private boolean isSeasonal;

    public Souvenir(double price, String itemName, int quantity, String dateReceived, String type, int idNumber, boolean isSeasonal) {
        super(price, itemName, quantity, dateReceived);
        this.type = type;
        this.idNumber = idNumber;
        this.isSeasonal = isSeasonal;
    }

    public String getType() {
        return type;
    }
    //cannot change type

    public int getIdNumber() {
        return idNumber;
    }
    //ID number cannot change

    public boolean isSeasonal() {
        return isSeasonal;
    }

    public void setSeasonal(boolean seasonal) {
        isSeasonal = seasonal;
    }

}
