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

    public InventoryItem getInventoryItem(String id) {

        return findItemById(id);
    }

    public InventoryItem deleteItem(String id) {
        InventoryItem item = findItemById(id);

        inventory.remove(item);

        return item;
    }

    public void addItem(InventoryItem item) {
        inventory.add(item);
    }


    public void replaceItemWithId(String id, InventoryItem newItem) {
        InventoryItem oldItem =  findItemById(id);

        inventory.remove(oldItem);

        newItem.setId(oldItem.getId());

        inventory.add(newItem);

    }

    private InventoryItem findItemById(String id) {
        for(InventoryItem item :  inventory) {
            if (item.getId().equals(id))
                return item;
        }

        return null;
    }

    private void addMockData() {

        Manufacturer manufacturer = new Manufacturer("David", "www", "070-555");
        InventoryItem item1 = new InventoryItem("0", "soffa", "2019-12-01", manufacturer);
        InventoryItem item2 = new InventoryItem("1", "bord", "2019-12-01", manufacturer);
        InventoryItem item3 = new InventoryItem("2", "ost", "2019-12-01", manufacturer);

        inventory.add(item1);
        inventory.add(item2);
        inventory.add(item3);

    }

}
