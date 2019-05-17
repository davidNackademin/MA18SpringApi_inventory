package com.example.MA18Inventory;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InventoryController {

    private Inventory inventory = new Inventory();


    @RequestMapping(value = "/inventory", method = RequestMethod.GET)
    public List<InventoryItem> getInventoryItems(@RequestParam(value="searchString", defaultValue = "") String searchString) {


        return  inventory.getInventory(searchString);
    }

    @RequestMapping(value = "/inventory", method = RequestMethod.POST)
    public InventoryItem postInventoryItem(@RequestBody InventoryItem item) {

        inventory.addItem(item);
        return item;
    }






}
