package com.product.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	private float offer;
	private float actualPrice;
	private float offerPrice;
	private boolean isAvailable;
	private String quantityType;
	private String category;
	private String productDescription;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "product",fetch = FetchType.LAZY)
	List<ImageModel> imageList=new ArrayList<>();

	
	public ProductInfo() {

	}
	
	public ProductInfo(String productName, int offer, float actualPrice, float offerPrice, boolean isAvailable,
			String quantityType, String category) {
		super();
		this.productName = productName;
		this.offer = offer;
		this.actualPrice = actualPrice;
		this.offerPrice = offerPrice;
		this.isAvailable = isAvailable;
		this.quantityType = quantityType;
		this.category = category;
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

	public float getOffer() {
		return offer;
	}

	public void setOffer(float offer) {
		this.offer = offer;
	}

	public float getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(Float actualPrice) {
		this.actualPrice = actualPrice;
	}

	public float getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(Float offerPrice) {
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
	public List<ImageModel> getImageList() {
		return imageList;
	}

	public void setImageList(List<ImageModel> imageList) {
		this.imageList = imageList;
	}

}
