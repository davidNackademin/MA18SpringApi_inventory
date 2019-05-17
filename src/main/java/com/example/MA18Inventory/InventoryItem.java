package com.example.MA18Inventory;

public class InventoryItem {

    private String id;
    private String name;
    private String releseDate;
    private Manufacturer manufacturer;


    public InventoryItem() {}

    public InventoryItem(String id, String name, String releseDate, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.releseDate = releseDate;
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReleseDate() {
        return releseDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleseDate(String releseDate) {
        this.releseDate = releseDate;
    }
}
