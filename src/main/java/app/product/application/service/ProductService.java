package app.product.application.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import app.product.application.dto.ProductDto;
import app.product.domain.entity.Product;
import app.salesorder.application.dao.SalesorderDAO;

@Service
public class ProductService {
	
	@Autowired
	SalesorderDAO salesorderDAO;
	
	@Transactional
	public ResponseEntity<Object> DescuentoStock(ProductDto productDto) throws Exception {

		List<Product> listaProducto =  new ArrayList<Product>();		
		Product product = new Product();
		product.setProduct_id(productDto.getProduct_id());
		product.setCategory_id(productDto.getCategory_id());
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		product.setCurrencyISOCode(productDto.getCurrencyISOCode());
		product.setStock(productDto.getStock());	
		product.setLotNumber(productDto.getLotNumber());
		product.setSanitaryRegistrationNumber(productDto.getSanitaryRegistrationNumber());
		product.setRegistrationDate(productDto.getRegistrationDate());
		product.setExpirationDate(productDto.getExpirationDate());
		product.setStatus(productDto.getStatus());
		product.setStock_status(productDto.getStock_status());
		listaProducto.add(product);
		
		Iterator<Product> itProductActualiza = listaProducto.iterator();
		
		while (itProductActualiza.hasNext())			
		{
			Product productActu = itProductActualiza.next();
			Product Productlis = new Product();
			Productlis.setProduct_id(productActu.getProduct_id());						
			Product listadoProBD = salesorderDAO.getIdProduct(productActu.getProduct_id(),productActu.getStock());			
			Productlis.setStock(listadoProBD.getStock() - productActu.getStock());			
			 salesorderDAO.updateProducto(Productlis);	
		}				
			return ResponseEntity.ok().body("ok");		
	}	

}
