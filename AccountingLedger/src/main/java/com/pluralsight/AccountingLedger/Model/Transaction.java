package com.pluralsight.AccountingLedger.Model;

public class Transaction {
    private int id;
    private String timestamp;
    private String description;
    private String vendor;
    private double amount;

    // Constructor
    public Transaction(String description, String vendor, double amount){
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    };

    // All arguments constructor
    public Transaction(int id, String timestamp, String description, String vendor, double amount){
        this.id = id;
        this.timestamp = timestamp;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    public String getVendor() {
        return vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVendor(String vendor) {
            this.vendor = vendor;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

//    /*
//    public void currentDate() {
//        LocalDate currentDate = LocalDate.now();
//        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalTime currentTime = LocalTime.now();
//        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
//        timestamp = currentDate.format(dateFormat) + time = currentTime.format(timeFormat);
//    } ended up unnecessary
//    */
}

