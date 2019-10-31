package com.ibm.training;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

		JDBCDao dao = context.getBean("jdbcDao", JDBCDao.class);

//        System.out.println(dao.createConnection());

		dao.createConnectionThroughJDBCTemplate();
		
//		System.out.println("Count of Users : " + dao.fetchNumberOfUsers());
		
//		System.out.println("UserName of id 4 is : " + dao.getUserNameByID(4));
		
//		System.out.println("User Details : " + dao.getAllDetailsOfUser(2));
		
//		for(User user : dao.getAllUsers()) {
//			System.out.println(user);
//		}
		
		
		//For inserting
		//dao.addNewUser(new User("Nihal Singh", "Rajastan, India"));
		dao.updateUser(new User(107, "Random ", "Random "));
		dao.deleteUser(104);
	}
}
