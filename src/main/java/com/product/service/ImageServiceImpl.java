package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.ImageModel;
import com.product.repo.ImageRepo;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageRepo imageRepo;
	
	public ImageModel save(ImageModel image) {
		return imageRepo.save(image);
	}

}
