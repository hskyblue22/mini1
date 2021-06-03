package com.projectGo.model.vo;

import java.io.Serializable;

public class Store implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5058103148712969047L;
	/**
	 * 
	 */
	
	private String storeName;
	private String storeIntroduce;
	private Menu storeMenu;
	private double aveStar;
	private int category;
	private int deliveryTip;
	private int deliveryTime;
	
		
	





	public Menu getStoreMenu() {
		return storeMenu;
	}





	public void setStoreMenu(Menu storeMenu) {
		this.storeMenu = storeMenu;
	}



	private String storeAddress;
	
	
	
	public Store() {
		// TODO Auto-generated constructor stub
	}





	public Store(String storeName, String storeIntroduce, double aveStar, int category, int deliveryTip,
			int deliveryTime) {
		super();
		this.storeName = storeName;
		this.storeIntroduce = storeIntroduce;
		this.aveStar = aveStar;
		this.category = category;
		this.deliveryTip = deliveryTip;
		this.deliveryTime = deliveryTime;
	}



	public String getStoreName() {
		return storeName;
	}



	public String getStoreIntroduce() {
		return storeIntroduce;
	}



	public double getAveStar() {
		return aveStar;
	}



	public int getCategory() {
		return category;
	}



	public int getDeliveryTip() {
		return deliveryTip;
	}



	public int getDeliveryTime() {
		return deliveryTime;
	}



	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}



	public void setStoreIntroduce(String storeIntroduce) {
		this.storeIntroduce = storeIntroduce;
	}



	public void setAveStar(double aveStar) {
		this.aveStar = aveStar;
	}



	public void setCategory(int category) {
		this.category = category;
	}



	public void setDeliveryTip(int deliveryTip) {
		this.deliveryTip = deliveryTip;
	}



	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	


	public String getStoreAddress() {
		return storeAddress;
	}



	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	
	
	
	
	

}