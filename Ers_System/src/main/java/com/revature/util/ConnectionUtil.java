package com.revature.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	
	private static Connection conn;
	
	private ConnectionUtil() {
		// /Ers_System/src/main/resources/db.properties
	}
	public static Connection getConnection() {
		System.out.println("inside getConnection");
			Properties props =  new Properties();
			try(InputStream in = ConnectionUtil.class.getClassLoader().getResourceAsStream("db.properties")) {
				props.load(in);
				Class.forName("oracle.jdbc.driver.OracleDriver");
				return DriverManager.getConnection(props.getProperty("jdbc.url"), props.getProperty("jdbc.username"), props.getProperty("jdbc.password"));
						
			} catch (ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
			} catch(FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} catch (SQLException sqle) {
				System.err.println(sqle.getMessage());
				System.err.println("SQL STATE" + sqle.getSQLState());
				System.err.println("Error Code" + sqle.getErrorCode());
				
			}
		
		return null;
	}

}

