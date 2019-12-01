package app.product.application.dto;
import java.util.List;

import app.common.application.dto.RequestBaseDto;
public class ProductListAllDto extends RequestBaseDto{
	
	private List<ProductDto> productDto;

	public List<ProductDto> getProductDto() {
		return productDto;
	}

	public void setProductDto(List<ProductDto> productDto) {
		this.productDto = productDto;
	}

	
	
}
