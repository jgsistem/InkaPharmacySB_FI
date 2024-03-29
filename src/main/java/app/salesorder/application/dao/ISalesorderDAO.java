package app.salesorder.application.dao;

import java.util.Date;
import java.util.List;

import app.product.domain.entity.Product;
import app.salesorder.domain.entity.Salesorder;
import app.salesorder.domain.entity.SalesorderAll;
import app.salesorderdetall.domain.entity.Saleorderdetall;

public interface ISalesorderDAO {
	
    public int saveSaveorder(Salesorder salesorder);
    public int saveSaveorderAll(SalesorderAll salesorder);
    public void saveSaveorderd(Saleorderdetall saleorderdetall,long productid,int result);	
    public void saveSaveorderdAll(List<Saleorderdetall> saleorderdetall,int result);	
	public List<Salesorder> getallSaveorder(int offset, int limit,String DateFrom, String DateTo);
	public Product getIdProduct(long idProduct, int stock);	
    public void updateProducto(Product product);		
}
