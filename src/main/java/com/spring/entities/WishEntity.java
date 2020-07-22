package com.spring.entities;


public class WishEntity {
	private String wishTitleString;
	private String wishContentString;
	private String wishDate;

	public WishEntity(String wishTitleString, String wishContentString, String wishDate) {
		super();
	
		this.wishTitleString = wishTitleString;
		this.wishContentString = wishContentString;
		this.wishDate = wishDate;
	}


	


	public String getWishTitleString() {
		return wishTitleString;
	}


	public void setWishTitleString(String wishTitleString) {
		this.wishTitleString = wishTitleString;
	}


	public String getWishContentString() {
		return wishContentString;
	}


	public void setWishContentString(String wishContentString) {
		this.wishContentString = wishContentString;
	}


	public String getWishDate() {
		return wishDate;
	}


	public void setWishDate(String wishDate) {
		this.wishDate = wishDate;
	}


	public WishEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "WishEntity [wishTitleString=" + wishTitleString + ", wishContentString=" + wishContentString
				+ ", wishDate=" + wishDate + "]";
	}

}
