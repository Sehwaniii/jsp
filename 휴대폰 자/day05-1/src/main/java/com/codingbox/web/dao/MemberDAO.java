package com.codingbox.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	// 이름으로 나이를 조회
	public int getAge(String name) {
		String sql = "SELECT age FROM MEMBER WHERE name=?";
		int age = 0;
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);
			rs = pstm.executeQuery();
			
			if( rs.next() ) {
				age = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return age;
		
		
	}
	
	
	
	
}






