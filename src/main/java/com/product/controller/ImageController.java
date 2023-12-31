package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.ImageModel;
import com.product.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageController {

	@Autowired
	private ImageService imageService;
	
	@PutMapping(value = "/saveimage",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ImageModel saveImage(@RequestBody ImageModel image) {
		return imageService.save(image);
	}
	
	@PutMapping("/updateimage/{ProductId}")
	public ImageModel updateImage(@RequestBody ImageModel image , @PathVariable ("ProductId") long productId) {
		
		System.out.println(image);
		return imageService.updateImage(image,productId);
	}
	
	@PutMapping("/linkimagetoproduct/{ProductId}/{ImageId}")
	public ImageModel linkImageToProduct(@PathVariable("ProductId") long productId, 
			@PathVariable ("ImageId") long imageId) {
		return imageService.updateLinkImageToProduct(productId,imageId);
	}
	
}
