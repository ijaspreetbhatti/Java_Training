package com.ibm.takehome.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ibm.takehome.bean.Product;

@Repository("productDao")
public class ProductDao implements IProductDAO {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		this.dataSource = dataSource;
	}

	// Gets Product details using JdbcTemplate
	public Product getProductDetails(String productCode) {
		Product response = null;
		String qry = "select * from products where productId = ?";
		try {
			response = jdbcTemplate.queryForObject(qry,new Object[] {productCode}, new ProductMapper());
		} catch (org.springframework.dao.EmptyResultDataAccessException e) {
			response = null;
		}
		return response;
	}

}

// Inner Class to Map Result to Product Bean
class ProductMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getInt("productId"));
		product.setProductName(rs.getString("productName"));
		product.setProductCategory(rs.getString("productCategory"));
		product.setProductDescription(rs.getString("productDescription"));
		product.setProductPrice(rs.getInt("productPrice"));
		return product;
	}

}
