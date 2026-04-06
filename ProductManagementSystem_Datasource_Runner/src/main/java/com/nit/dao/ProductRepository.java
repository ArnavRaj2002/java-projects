package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.nit.model.Product;
@Repository
public class ProductRepository implements IProductRepository {
	@Autowired
	 public DataSourceConfig ds;
//	@Bean
//	@ConfigurationProperties(prefix = "app.ds")
	public DataSource getDataSource()
	{
		//return DataSourceBuilder.create().build();
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName(ds.getDriver());
		dmds.setUrl(ds.getUrl());
		dmds.setUsername(ds.getUsername());
		dmds.setPassword(ds.getPassword());
		return dmds;
	}
	
	@Override
	public String saveProduct(Product p) {
 		try(Connection conn=getDataSource().getConnection())
 		{
 			PreparedStatement pstmt = conn.prepareStatement("insert into product(id,name,price,quantity) values(?,?,?,?)");
 			int executeUpdate = pstmt.executeUpdate();
 			if(executeUpdate>0) return "1 record inserted sucessfully >>>> ";
 		}
 		catch (Exception e) {
			e.printStackTrace();
		}
		return "record not inserted";
	}

	@Override
	public String updateProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
