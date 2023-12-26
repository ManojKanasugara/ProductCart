package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.ProductInfo;

public interface ProductInfoRepo extends JpaRepository<ProductInfo, Long>{



}
