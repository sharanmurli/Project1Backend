package com.niit.dao;

import java.util.List;

import com.niit.models.CartItem;
import com.niit.models.CustomerOrder;
import com.niit.models.User;

public interface CartItemDao {
	public List<CartItem> getCart(String email);
 void addToCart(CartItem cartItem);

User getUser(String email);

void removeCartItem(int cartItemId);

CustomerOrder createCustomerOrder(CustomerOrder customerOrder);





}
