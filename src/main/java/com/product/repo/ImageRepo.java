package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.ImageModel;

public interface ImageRepo extends JpaRepository<ImageModel, Long>{

	// public ImageModel save(ImageModel image);

}
