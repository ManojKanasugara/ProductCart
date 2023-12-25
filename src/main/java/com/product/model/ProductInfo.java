package com.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*
 * this class holds product entity info
 */
@Entity
@Table(name = "product_info")
public class ProductInfo {

	@Id
	@GeneratedValue(generator = "uuid", strategy = GenerationType.AUTO)
	private long productId;
	private String productName;
	private int offer;
	private float actualPrice;
	private float offerPrice;
	private boolean isAvailable;
	private String quantityType;
	private String category;
	
	private String productDescription;
	
	
	public ProductInfo() {

	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getOffer() {
		return offer;
	}

	public void setOffer(int offer) {
		this.offer = offer;
	}

	public float getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(int actualPrice) {
		this.actualPrice = actualPrice;
	}

	public float getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(int offerPrice) {
		this.offerPrice = offerPrice;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getQuantityType() {
		return quantityType;
	}

	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}

	public void setActualPrice(float actualPrice) {
		this.actualPrice = actualPrice;
	}

	public void setOfferPrice(float offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	

}
