package org.example.solid.openClosed;

import org.example.solid.openClosed.services.GlobalStorage;

public class Order {
    private String nameOfTheProduct;
    private boolean isValid;
    private String customerName;
    private String customerEmail;
    public Order(){}
    public Order(String nameOfTheProduct, String customerName, String customerEmail){
        this.nameOfTheProduct = nameOfTheProduct;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        if(GlobalStorage.globalStorage.contains(nameOfTheProduct)) isValid = true;
        else isValid = false;
    }

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

    public void setNameOfTheProduct(String nameOfTheProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
