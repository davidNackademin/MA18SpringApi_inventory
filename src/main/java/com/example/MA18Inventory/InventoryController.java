package com.example.MA18Inventory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InventoryController {


    @RequestMapping(value = "/inventory", method = RequestMethod.GET)
    public List<InventoryItem> getInventoryItems() {

        ArrayList<InventoryItem> list = new ArrayList<>();

        InventoryItem item1 = new InventoryItem("0", "soffa", "2019-12-01");
        InventoryItem item2 = new InventoryItem("1", "bord", "2019-12-01");
        InventoryItem item3 = new InventoryItem("2", "ost", "2019-12-01");

        list.add(item1);
        list.add(item2);
        list.add(item3);

        return  list;
    }






}
