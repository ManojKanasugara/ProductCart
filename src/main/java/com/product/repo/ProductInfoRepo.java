package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.model.ProductInfo;

@Repository
public interface ProductInfoRepo extends JpaRepository<ProductInfo, Long>{

	static void updateProduct(Long productId) {
		
	}

	
		
	


}
