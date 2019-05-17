package com.example.MA18Inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<InventoryItem> inventory;


    public Inventory() {
        this.inventory = new ArrayList<>();
        addMockData();
    }


    public List<InventoryItem> getInventory(String searchString) {

        if(searchString.equals(""))
            return inventory;


        ArrayList<InventoryItem> items = new ArrayList<>();
        for (InventoryItem item : inventory) {
            if(item.getName().toLowerCase().contains(searchString.toLowerCase()))
                items.add(item);
        }

        return items;
    }

    public void addItem(InventoryItem item) {
        inventory.add(item);
    }


    private void addMockData() {

        InventoryItem item1 = new InventoryItem("0", "soffa", "2019-12-01");
        InventoryItem item2 = new InventoryItem("1", "bord", "2019-12-01");
        InventoryItem item3 = new InventoryItem("2", "ost", "2019-12-01");

        inventory.add(item1);
        inventory.add(item2);
        inventory.add(item3);

    }

}
