package connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToOracle {

	/**
	 * ʹ��java����Oracle���ݿ�����д
	 */
	//������
	private final static String serverName = "localhost";
	//���ݿ���
	private final static String databaseName = "orcl";
	//���ӵ�ַ
	private final static String DB_URL_2 = "jdbc:oracle:thin:@//"+serverName+":1521/"+databaseName;
	
	
	//����Oracle���ݿ��Url������orcl��ʾ���ӵ����ݿ�
	private final static String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	//Oracle���ݿ���������
	private final static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	//���ݿ������û���
	private final static String DB_USERNAME = "scott";
	//����Oracle���ݿ������
	private final static String DB_PASSWORD = "tiger";
	
	//��ȡ���ݿ�����
	public static Connection getConnection(){
		//�������ݿ����Ӷ���
		Connection conn = null;
		
		try{
			//ʹ��Class.forName()�����Զ�����������������ʵ�����Զ�����DriverManager��ע����
			Class.forName(DB_DRIVER);
			//ͨ��DriverManager��getConnection()��������ݿ�ʵ��
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		}catch(Exception ex){
			//��ӡ�쳣��ջ
			ex.printStackTrace();
		}
		//�������ݿ����ӵ�ʵ��
		return conn;
	}
	
	//�ر����ݿ�����
	public static void closeConnection(Connection conn){
		try{
			if(conn != null){
				//�жϵ�ǰ���Ӷ���û�йر�
				if(!conn.isClosed()){
					//�ر����ݿ�
					conn.close();
				}
			}
		}catch(Exception ex){
			System.out.println("******���ݿ�ر��쳣******");
			ex.printStackTrace();//��ӡ�쳣��ջ
		}
	}
	
	
}