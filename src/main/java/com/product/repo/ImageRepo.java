package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.ImageModel;
import com.product.model.ProductInfo;

public interface ImageRepo extends JpaRepository<ImageModel, Long>{

	ImageModel save(ProductInfo product);


	
}
