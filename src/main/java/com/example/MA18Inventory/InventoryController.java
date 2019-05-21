package com.example.MA18Inventory;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class InventoryController {

    private Inventory inventory = new Inventory();


    @RequestMapping(value = "/inventory", method = GET)
    public List<InventoryItem> getInventoryItems(@RequestParam(value="searchString", defaultValue = "") String searchString) {


        return  inventory.getInventory(searchString);
    }

    @RequestMapping(value = "/inventory", method = RequestMethod.POST)
    public InventoryItem postInventoryItem(@RequestBody InventoryItem item) {

        inventory.addItem(item);
        return item;
    }

    @RequestMapping(value = "/inventory/{id}", method = GET)
    public InventoryItem getInvetoryItem(@PathVariable("id") String itemId) {

        InventoryItem item = inventory.getInventoryItem(itemId);

        return item;

    }








}
