package com.bean;

public class CartBean {
//cartId
//Userid
//ProductId
	
	int productId , cartId , userId;
	
	 public CartBean()
	{
		cartId = (int)(Math.random()*100000000);
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
