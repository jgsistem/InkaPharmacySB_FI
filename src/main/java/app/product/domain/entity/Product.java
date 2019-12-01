package app.product.domain.entity;

import java.util.Date;

public class Product {
	
	private long id;
	private String name;
	private Double price;
	private String currency;
	private int stock;
	private long category_id;
	private String lot_number;
	private String sanitary_registration_number;
	private Date lot_registration_datenumber;
	private Date expiration_date;
	private int status;
	private int stock_status;
	
	public Product() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getLot_number() {
		return lot_number;
	}

	public void setLot_number(String lot_number) {
		this.lot_number = lot_number;
	}

	public String getSanitary_registration_number() {
		return sanitary_registration_number;
	}

	public void setSanitary_registration_number(String sanitary_registration_number) {
		this.sanitary_registration_number = sanitary_registration_number;
	}

	public Date getLot_registration_datenumber() {
		return lot_registration_datenumber;
	}

	public void setLot_registration_datenumber(Date lot_registration_datenumber) {
		this.lot_registration_datenumber = lot_registration_datenumber;
	}

	public Date getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
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
