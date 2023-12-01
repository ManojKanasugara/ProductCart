package com.product.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.product.model.ImageModel;

public interface ProductInfoService {
	

	public ImageModel saveAllImages(MultipartFile[] fileList) throws IOException ;

}
