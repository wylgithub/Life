package myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJavaBean {

	//�������ݿ����Ӷ���
	Connection conn;
	
	Statement stmt;
	
	public MyJavaBean(){
		try{
			//�������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//�����������ݿ�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_user", "root", "woaiwojia..123");
			stmt = conn.createStatement();
		}catch(Exception ex){
			//��ӡ�쳣��ջ
			ex.printStackTrace();
		}
	}
	
	public String login(String name,String password){
		String message = "abc";
		try{
			//��ѯ���ݿ�
			String sql1 = "select count(*) from user_info where user_name='"+name+"'";
			ResultSet rs1 = stmt.executeQuery(sql1);
			if(rs1.next()){
				int userCount = rs1.getInt(1);
				if(0 == userCount){
					message = "�����ڸ��û���";
					return message;
				}
				
				String sql2 = "select count(*) from user_info where user_name = '"+name+"'and password'"+password+'"';
				ResultSet rs2 = stmt.executeQuery(sql2);
				if(rs2.next()){
					int trueUserCount = rs2.getInt(1);
					if(0 == trueUserCount){
						message = "�������";
						return message;
					}
					message = "�ɹ���";
				}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return message;
	}
}
