package com.spring.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/crud";
	private String user = "root";
	private String password = "1234";

	public void getAllStudent() throws SQLException, ClassNotFoundException {

		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);

		Statement stmt = conn.createStatement();

		ResultSet result = stmt.executeQuery("SELECT * FROM crud.student_info");

		while (result.next()) {
			int studentId = result.getInt(1);
			String studentName = result.getString(2);
			String age = result.getString(3);
			String standard = result.getString(4);

			System.out.println(studentId + " " + studentName + " " + age + " " + standard);

		}

		conn.close();

	}
	
	public void deleteStudentById(int studentId) throws ClassNotFoundException, SQLException {
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);

		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate("delete from crud.student_info where StudentId = "+studentId);
		System.out.println("Student data deleted successfully "+studentId);
		
		conn.close();
	}

}
