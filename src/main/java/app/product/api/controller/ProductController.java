package app.product.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.common.application.ApiResponseHandler;
import app.common.application.Notification;
import app.common.application.UnitOfWork;
import app.common.application.enumeration.RequestBodyType;
import app.product.application.dto.ProductDto;
import app.product.application.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	ApiResponseHandler apiResponseHandler;
	
	@Autowired
	UnitOfWork unitOfWork;
	
	@Autowired
	ProductService productService;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method = RequestMethod.POST, path = "", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Object> DescuentoStock(@RequestBody ProductDto productDto) throws Exception {
		boolean status = false;
		try {
			Notification notification = this.validation(productDto);
			if (notification.hasErrors()) {
				throw new IllegalArgumentException(notification.errorMessage());
			}			
			return new ResponseEntity<Object>(productService.DescuentoStock(productDto),
					HttpStatus.CREATED);
		} catch (IllegalArgumentException ex) {
			unitOfWork.rollback(status);
			return new ResponseEntity<Object>(apiResponseHandler.getApplicationError(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {
			unitOfWork.rollback(status);
			return new ResponseEntity<Object>(apiResponseHandler.getApplicationException(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	private Notification validation(ProductDto productDto) {
		Notification notification = new Notification();
		if (productDto == null || productDto.getRequestBodyType() == RequestBodyType.INVALID) {
			notification.addError("Invalid JSON data in request body.");
		}
		return notification;
	}

}
