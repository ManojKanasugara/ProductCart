package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.ImageModel;
import com.product.model.ProductInfo;
import com.product.repo.ImageRepo;
import com.product.repo.ProductInfoRepo;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageRepo imageRepo;
	@Autowired 
	private ProductInfoRepo productInfoRepo;
	
	public ImageModel save(ImageModel image) {
		
		return imageRepo.save(image);
	}

	
	public ImageModel updateImage(ImageModel image, long productId) {
		ProductInfo product = productInfoRepo.findById(productId).get();
		image.setProduct(product);
		return imageRepo.save(image);

	}


	public ImageModel updateLinkImageToProduct(long productId, long imageId) {
	  ImageModel image = imageRepo.findById(imageId).get();
		image.setProduct(productInfoRepo.findById(productId).get());
		return imageRepo.save(image);
	}
	
	

}
