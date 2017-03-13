package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterDaoImpl implements RegisterDao{

	@Autowired
	private DataSource dataSource;

	private static final String INSERT_QUERY = "Insert into REGISTER_USER values(?,?,?,?)";
	private static final String SELECT_QUERY = "Select * from REGISTER_USER";

	public void dataInsert(RegisterModel model) {
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement stmnt = con.prepareStatement(INSERT_QUERY);
			stmnt.setString(1, model.getUserName());
			stmnt.setString(2, model.getUserPassword());
			stmnt.setString(3, model.getUserEmail());
			stmnt.setString(4, model.getUserCountry());
			stmnt.execute();
			stmnt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	
		
	}
	
	public List<RegisterModel> dataWork() {
		List<RegisterModel> list = new ArrayList<RegisterModel>();
		Connection con = null;
		try {
			con = dataSource.getConnection();
			RegisterModel registerModel ;
			PreparedStatement stmnt = con.prepareStatement(SELECT_QUERY);
			ResultSet rs = stmnt.executeQuery();
			
			while(rs.next()) {
				registerModel = new RegisterModel();
				registerModel.setUserName(rs.getString(1));
				registerModel.setUserPassword(rs.getString(2));
				registerModel.setUserEmail(rs.getString(3));
				registerModel.setUserCountry(rs.getString(4));
				list.add(registerModel);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
}
