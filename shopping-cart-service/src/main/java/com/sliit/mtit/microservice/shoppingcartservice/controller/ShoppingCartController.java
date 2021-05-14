package com.sliit.mtit.microservice.shoppingcartservice.controller;


import com.sliit.mtit.microservice.shoppingcartservice.dto.ShoppingCartRequest;
import com.sliit.mtit.microservice.shoppingcartservice.dto.ShoppingCartResponse;
import com.sliit.mtit.microservice.shoppingcartservice.service.ShoppingCartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartServiceImpl shoppingCartService;

    @PostMapping(consumes = "application/json" , produces = "application/json")
    public @ResponseBody ShoppingCartResponse createShoppingCart(@RequestBody ShoppingCartRequest shoppingCartRequest) {

        System.out.println("Shopping cart details: " + shoppingCartRequest);

        return shoppingCartService.createShoppingCart(shoppingCartRequest);
    }

}
