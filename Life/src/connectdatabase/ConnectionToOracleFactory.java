package connectdatabase;

import java.sql.Connection;

public class ConnectionToOracleFactory {

	//���ݿ����Ӵ���������
	private ConnectToOracle cto = new ConnectToOracle();
	
	//��ȡ���ݿ����Ӷ���ʵ��
	public ConnectToOracle getConnectToOracle(){
		//���Ϊ�վʹ���һ���µ����Ӷ���ʵ��
		if(cto == null){
			cto = new ConnectToOracle();
			return cto;
		}else{
			//�����Ϊ�վ�ֱ�ӷ����������
			return cto;
		}
		
	}
	
	//�ر����ݿ�����
	public void closeConnection(Connection conn){
		if(conn == null){
			cto = new ConnectToOracle();
		}
		//���ùر����ݿ�ķ���
		cto.closeConnection(conn);
		
	}
}
