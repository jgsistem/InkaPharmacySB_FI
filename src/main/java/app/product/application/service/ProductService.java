package app.product.application.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import app.product.application.dto.ProductDto;
import app.product.domain.entity.Product;
import app.salesorder.application.dto.SalesorderAllCreateDto;
import app.salesorder.domain.entity.SalesorderAll;
import app.salesorderdetall.domain.entity.Saleorderdetall;

@Service
public class ProductService {
	
	@Transactional
	public ResponseEntity<Object> DescuentoStock(ProductDto productDto) throws Exception {

		SalesorderAll salesorder = new SalesorderAll();
		salesorder.setSale_date(obtenerFechaActual());
		salesorder.setCustomer_id(salesorderCreateDtoall.getCustomer_id());
		salesorder.setEmployee_id(salesorderCreateDtoall.getEmployee_id());
		salesorder.setStatus(salesorderCreateDtoall.getStatus());			
		List<Saleorderdetall> saleorderdetall = new ArrayList<>();		
		List<Product> listaProducto =  new ArrayList<Product>();
		
		for (Saleorderdetall purchaseorderdetallListDtou : salesorderCreateDtoall.getSalesorderdetall()) {		
			Saleorderdetall purchaseorderdetallListDtoTem = new Saleorderdetall();	
			Product Productlis = new Product();			
			purchaseorderdetallListDtoTem.setSale_order_id(purchaseorderdetallListDtou.getSale_order_id());
			purchaseorderdetallListDtoTem.setProduct_id(purchaseorderdetallListDtou.getProduct_id());
			purchaseorderdetallListDtoTem.setQuantity(purchaseorderdetallListDtou.getQuantity());
			purchaseorderdetallListDtoTem.setPrice(purchaseorderdetallListDtou.getPrice());
			purchaseorderdetallListDtoTem.setCurrency(purchaseorderdetallListDtou.getCurrency());
			purchaseorderdetallListDtoTem.setStatus(purchaseorderdetallListDtou.getStatus());							
			Productlis.setProduct_id(purchaseorderdetallListDtou.getProduct_id());
			Productlis.setStock(purchaseorderdetallListDtou.getQuantity());			
			listaProducto.add(Productlis);			
			saleorderdetall.add(purchaseorderdetallListDtoTem);		
		}	
		
		//List<Product> listaProductoF =  new ArrayList<Product>();
		Iterator<Product> itProductActualiza = listaProducto.iterator();
	
		
			
			return ResponseEntity.ok().body("ok");		
	}
	

}
