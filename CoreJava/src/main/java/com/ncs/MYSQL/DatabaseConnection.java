package com.ncs.MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnection {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement(
				"Insert into register values('Shashank','shashank12@gmail.com','pass12','Male','Indore')");

		int a = ps.executeUpdate();

		if (a > 0) {

			System.out.println("Data Inserted");
		} else {

			System.out.println("Failed");
		}

	}

}
