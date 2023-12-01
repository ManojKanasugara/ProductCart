package com.product.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "image_table")
public class ImageModel {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String imageId;
	private String name;
	@Lob
	private byte[] imageUrl;

	public ImageModel() {

	}

	public ImageModel(String name, byte[] data) {
		super();
		this.name = name;
		this.imageUrl = data;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getData() {
		return imageUrl;
	}

	public void setData(byte[] data) {
		this.imageUrl = data;
	}

}
