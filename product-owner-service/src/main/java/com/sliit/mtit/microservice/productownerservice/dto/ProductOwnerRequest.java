package com.sliit.mtit.microservice.productownerservice.dto;

public class ProductOwnerRequest {

    private String adminName;
    private String adminEmail;
    private String productOwnerName;
    private String stockName;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getProductOwnerName() {
        return productOwnerName;
    }

    public void setProductOwnerName(String productOwnerName) {
        this.productOwnerName = productOwnerName;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public String toString() {
        return "ProductOwnerRequest{" +
                "adminName='" + adminName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", productOwnerName='" + productOwnerName + '\'' +
                ", stockName='" + stockName + '\'' +
                '}';
    }
}
