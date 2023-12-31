package com.product.service;

import com.product.model.ImageModel;

public interface ImageService {

	public ImageModel save(ImageModel image);

	public ImageModel updateImage(ImageModel name, long productId);

	public ImageModel updateLinkImageToProduct(long productId, long imageId);
	
	

}
