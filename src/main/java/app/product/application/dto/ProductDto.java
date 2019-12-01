package app.product.application.dto;

import java.util.Date;
import java.util.List;
import app.common.application.dto.RequestBaseDto;
import app.product.domain.entity. Product;

public class ProductDto extends RequestBaseDto{

	private long productid;
	private String name;
	private Double price;
	private String Currency;
	private String CurrencyISOCode;
	private int stock;
	private long category_id;
	private String lotNumber;
	private String sanitaryRegistrationNumber;
	private Date registrationDate;
	private Date expirationDate;
	private int status;
	private int stock_status;



	public ProductDto() {		
	}


	public long getProductid() {
		return productid;
	}





	public void setProductid(long productid) {
		this.productid = productid;
	}





	public String getCurrency() {
		return Currency;
	}


	public void setCurrency(String currency) {
		Currency = currency;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	

	public String getCurrencyISOCode() {
		return CurrencyISOCode;
	}


	public void setCurrencyISOCode(String currencyISOCode) {
		CurrencyISOCode = currencyISOCode;
	}


	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	

	public String getLotNumber() {
		return lotNumber;
	}


	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}


	public String getSanitaryRegistrationNumber() {
		return sanitaryRegistrationNumber;
	}


	public void setSanitaryRegistrationNumber(String sanitaryRegistrationNumber) {
		this.sanitaryRegistrationNumber = sanitaryRegistrationNumber;
	}


	public Date getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}


	public Date getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}


	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStock_status() {
		return stock_status;
	}

	public void setStock_status(int stock_status) {
		this.stock_status = stock_status;
	}

	
	
	
}
