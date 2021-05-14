package com.sliit.mtit.microservice.productinventoryservice.controller;

import com.sliit.mtit.microservice.productinventoryservice.dto.InventoryRequest;
import com.sliit.mtit.microservice.productinventoryservice.dto.InventoryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/product-inventory")
public class ProductInventoryController {

    @PostMapping(consumes = "application/json" ,  produces = "application/json")
    public @ResponseBody InventoryResponse createInventory(@RequestBody InventoryRequest inventoryRequest){

        System.out.println("Inventory Details :" + inventoryRequest);

        var inventoryResponse =  new InventoryResponse();
        inventoryResponse.setProductId(UUID.randomUUID().toString());
        inventoryResponse.setMessage("Successfully created the your product inventory");

        return inventoryResponse;

    }
}
