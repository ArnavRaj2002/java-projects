package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Product;
@Repository
public class ProductDAO {
	@Autowired
	private DataSource ds;
	List<Product> listToVerifyStock;
	ResultSet rs1;
	public List<Product> getListOfProducts() {
		  listToVerifyStock = new ArrayList<Product>();
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement("select * from products");
            rs1 = pstmt.executeQuery();
            while(rs1.next())
            {
            	listToVerifyStock.add(new Product(rs1.getInt(1),rs1.getString(2),rs1.getDouble(3), rs1.getInt(4)));
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listToVerifyStock;
	}

	

	public boolean getListOfProductByID(int id) {
		List<Product> list = new ArrayList<Product>();
		try (Connection con = ds.getConnection();) {
			PreparedStatement pstmt = con.prepareStatement("select * from products where id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4)));
				return true;
			} // why pass from rs(db) to product const
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

 public String increaseStock(int qty,int id) {
	//public String IncreaseStock(Product prod) {
		try (Connection con = ds.getConnection();) {
			PreparedStatement pstmt = con.prepareStatement("update products set  QUANTITY=QUANTITY+? where id=? ");
			pstmt.setInt(1,qty);
			pstmt.setInt(2, id);
//			pstmt.setInt(1, prod.getQuantity());
//			pstmt.setInt(2, prod.getId());
			int executeUpdate = pstmt.executeUpdate();
			if (executeUpdate > 0)
				return "Quantity Increased";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Quantity Not Increased";

	}

//	public String decreaseStock(int qty,int id) {
//		
//		try (Connection con = ds.getConnection();) {
//			if(rs1.getInt(4)>=qty)
//			{
//				PreparedStatement pstmt = con.prepareStatement("update products set QUANTITY=QUANTITY-? where id=?");
//				pstmt.setInt(1, qty);
//				pstmt.setInt(2, id);
//				int executeUpdate = pstmt.executeUpdate();
//				if (executeUpdate > 0)
//					return "Quantity Decreased";
//			}
//			 
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		 
//		 return "Quantity is not decreased due to Low stock";
//
//	}
 
 public String decreaseStock(int qty,int id) {
		
		try (Connection con = ds.getConnection();) {
			
				PreparedStatement checkPstmt = con.prepareStatement("select QUANTITY from products where id=?");
                checkPstmt.setInt(1, id);     //??
                ResultSet rs = checkPstmt.executeQuery();
                if(rs.next()) //vs while()
                {
                	if(rs.getInt(1)>=qty)
        			{
    				PreparedStatement pstmt = con.prepareStatement("update products set QUANTITY=QUANTITY-? where id=?");
    				pstmt.setInt(1, qty);
    				pstmt.setInt(2, id);
    				int executeUpdate = pstmt.executeUpdate();
    				return (executeUpdate > 0)? "Quantity Decreased":"Quantity is not decreased due to low stock";
    					 
    			}
                }
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		  return "Product ID " + id + " not found.";

	}

	public List<Product> productBelowThreshold(int qty) {
		List<Product> listOfProductBelowThreshold = new ArrayList<Product>();
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement("select * from products where QUANTITY<?");
			pstmt.setInt(1, qty);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				listOfProductBelowThreshold
						.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfProductBelowThreshold;
	}

}
