package com.sliit.mtit.microservice.wishlistservice.controller;

import com.sliit.mtit.microservice.wishlistservice.dto.WishListRequest;
import com.sliit.mtit.microservice.wishlistservice.dto.WishListResponse;
import com.sliit.mtit.microservice.wishlistservice.service.WishListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wish-list")
public class WishListController {

    @Autowired
    private WishListServiceImpl wishListService;

    @PostMapping(consumes = "application/json" , produces = "application/json")
    public @ResponseBody WishListResponse createWishList(@RequestBody WishListRequest wishListRequest){

        System.out.println("WishList Details : " + wishListRequest);

        return wishListService.createWishList(wishListRequest);
    }

}
