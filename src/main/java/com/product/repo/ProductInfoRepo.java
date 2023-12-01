package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.ImageModel;

public interface ProductInfoRepo extends JpaRepository<ImageModel, String>{

}
