package com.company.inventory;

public class Food extends Item {

    private String category;
    private String expirationDate;
    private boolean isRefrigerated;

    public Food(double price, String itemName, int quantity, String dateReceived, String category, String expirationDate, boolean isRefrigerated) {
        super(price, itemName, quantity, dateReceived);
        this.category = category;
        this.expirationDate = expirationDate;
        this.isRefrigerated = isRefrigerated;
    }

    public String getCategory() {
        return category;
    }
    //category cannot change

    public String getExpirationDate() {
        return expirationDate;
    }
    //expiration date cannot change

    public boolean isRefrigerated() {
        return isRefrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        isRefrigerated = refrigerated;
    }
}
