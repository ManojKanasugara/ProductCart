package com.product.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "image_table")
public class ImageModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imageId;
	private String title;
	private String alt;
	@Lob
	private byte[] image;
	@Lob
	private byte[] thumbImage;

	@ManyToOne
	@JoinColumn(name = "productId")
	@JsonBackReference
	private ProductInfo product;

	public ImageModel() {

	}

	public ImageModel(String title, String alt, byte[] image, byte[] thumbImage) {
		super();
		this.title = title;
		this.alt = alt;
		this.image = image;
		this.thumbImage = thumbImage;
	}

	public ImageModel(String title, byte[] image) {
		super();
		this.title = title;
		this.image = image;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public ProductInfo getProduct() {
		return product;
	}

	public void setProduct(ProductInfo product) {
		this.product = product;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public byte[] getThumbImage() {
		return thumbImage;
	}

	public void setThumbImage(byte[] thumbImage) {
		this.thumbImage = thumbImage;
	}

}
