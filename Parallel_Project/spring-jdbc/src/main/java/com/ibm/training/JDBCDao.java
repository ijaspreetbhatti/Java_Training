package com.ibm.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("jdbcDao")
public class JDBCDao {

	DataSource dataSource;

	JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;

		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	void createConnectionThroughJDBCTemplate() throws SQLException {

		// Get the Connection
		Connection dbCon = dataSource.getConnection();

		// Or like this
//		jdbcTemplate.setDataSource(dataSource);
	}

	Integer fetchNumberOfUsers() {

		// Write the query
		String qryFetch = "select count(name) from ";

		// Execute the ferth query with JDBCTemplate
		return jdbcTemplate.queryForObject(qryFetch, Integer.class);

	}

	String getUserNameByID(int accountNumber) {
		// Write the query
		String qryFetch = "select name from accounts where accountNumber = ?";

		// Execute the query
		return jdbcTemplate.queryForObject(qryFetch, new Object[] { accountNumber }, String.class);
	}

	User getAllDetailsOfUser(int accountNumber) {
		// Write the query
		String qry = "select * from accounts where accountNumber = ?";

		// Execute the query
		return jdbcTemplate.queryForObject(qry, new Object[] { accountNumber }, new UserMapper());
	}

	List<User> getAllUsers() {
		// Write the query
		String qry = "select * from accounts";

		// Execute the query
		return jdbcTemplate.query(qry, new UserMapper());
	}

	// Insert a new row
	void addNewUser(User user) {
		// Write the query
		String qry = "insert into accounts(name, address) values (?,?)";

		// Execute the query
		jdbcTemplate.update(qry, new Object[] { user.getUserName(), user.getUserAddress() });
	}

	void updateUser(User user) {
		// Write the query
		String qry = "update accounts set name = ?, address = ? where accountNumber=?";

		// Execute the query
		jdbcTemplate.update(qry, new Object[] { user.getUserName(), user.getUserAddress(), user.getAccountNumber() });
	}

	void deleteUser(int accountNumber) {
		// Write the query
		String qry = "delete from accounts where accountNumber=?";

		// Execute the query
		jdbcTemplate.update(qry, new Object[] {accountNumber});
	}

	// Create an inner class that implements RowMapper

	class UserMapper implements RowMapper<User> {

		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();

			user.setAccountNumber(rs.getInt("accountNumber"));
			user.setUserName(rs.getString("name"));
			user.setUserAddress(rs.getString("address"));

			return user;
		}

	}

//	Older code
	String createConnectionThroughPureJDBC() {

		String returnValue = "";
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");

			Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibmDeveloper", "root", "");

			if (dbCon != null) {
				returnValue = "Connected...";
			} else
				returnValue = "Some issues...";

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnValue;
	}
}
