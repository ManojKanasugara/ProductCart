package com.product.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.product.model.ImageModel;
import com.product.model.ProductInfo;

public interface ProductInfoService {
	

	public ImageModel saveAllImages(MultipartFile[] fileList) throws IOException ;
	
	public ProductInfo saveProduct(ProductInfo product);
	
	public void store() throws Exception ;

	public ProductInfo findById(Long productId);

	public void deleteById(Long productId);

	public ProductInfo updateOfferPrice(long productId, float offerPrice);


	

	

}
