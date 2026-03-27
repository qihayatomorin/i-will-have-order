package com.campus.service;

import com.campus.dto.ShoppingCartDTO;
import com.campus.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    boolean addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    List<ShoppingCart> listShoppingCart();

    boolean clearShoppingCart();

    boolean subShoppingCart(ShoppingCartDTO shoppingCartDTO);

    ShoppingCart getShoppingCartItem(Long userId, ShoppingCartDTO shoppingCartDTO);
}
