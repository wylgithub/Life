package fileReadFromLocalHost;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * ���������ʹ��java��ȡ���߻���д�����ݵ����ش�����ָ�����ļ�
 * @author Administrator
 *
 */
public class JavaFileOperation {

	/**
	 * ��ȡ���ش���·�����ļ���ʾ���ն���
	 * @param filePath�� ��ȡ�ļ��ı���·�� 
	 */
	public static void ReadFileFromLocalHost(final String filePath){
		try{
			//��ȡ�����ļ�
			FileInputStream file = new FileInputStream(filePath);
			//���ַ�������ת�����ֽ���,���ϻ���Ĺ���(InputStreamReader�� �����ֽ�ת��Ϊ�ַ�������)
			BufferedReader buf = new BufferedReader(new InputStreamReader(file));
			
			String str = null;
			//��¼�ļ��Ķ�ȡ������
			int line = 1;
			//һ��һ�еĶ�ȡ�ļ��е�����
			while((str = buf.readLine()) != null){
				System.out.println("��"+line+"�е�����Ϊ: "+str);
				line++;
			}
			//�ر��ļ�
			file.close();
		}catch(IOException ex){
			System.out.println("�ļ���ȡʧ��!");
			ex.printStackTrace();
		}
	}
	
	/**
	 * �ڱ��ش��̵�ָ��Ŀ¼����ָ�����ļ�
	 * @param filePath �ļ����ڵ�·��
	 * @param fileName �ļ���+��׺��
	 */
	public static void createFileToLocalHost(final String filePath,final String fileName){
		//����һ���ļ�����������ָ���Ĵ���Ŀ¼��
		File file = new File(filePath,fileName);
		try{

			//�����ļ�
			file.createNewFile();
			System.out.println("�ļ������ɹ���");
		}catch(IOException ex){
			System.out.println("�ļ�����ʧ�ܣ�");
			//��ӡ�쳣��ջ
			ex.printStackTrace();
		}
	}
	
	//�����������������뵽���ش����е��ļ�
	public static void WriteFileToLocalHost(final String filePath){
		
		//�����ַ�
		Scanner console = new Scanner(System.in);
		System.out.println("����������: ");
		
//		int i=1;
//		while(i<1000000){
//			System.out.println("�������,���ڱ���.");
//			System.out.println("�������,���ڱ���..");
//			System.out.println("�������,���ڱ���...");
//			System.out.println("�������,���ڱ���....");
//			System.out.println("�������,���ڱ���.....");
//			System.out.println("�������,���ڱ���......");
//			System.out.println("�������,���ڱ���.......");
//			System.out.println("�������,���ڱ���........");
//			System.out.println("�������,���ڱ���..........");
//			i++;
//		}
		//�����ַ�
		String str = console.next();
		byte bt[] = new byte[10240];
		bt = str.getBytes();
		try{
			//ʵ����һ���ļ�д�����
			FileOutputStream in = new FileOutputStream(filePath);
			try{
				//д���ļ�
				in.write(bt, 0, bt.length);
				System.out.println("�������,���ڱ���......");	
				System.out.println("�ļ�д��ɹ���");
			}catch(Exception ex){
				System.out.println("�ļ�д���쳣��");
				ex.printStackTrace();
			}finally{
				//�ر��ļ�д��
				in.close();
			}
		}catch(IOException ex){	
			System.out.println("�ļ�д��ʧ��!");
			//��ӡ�쳣��ջ
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * �ж��ļ��Ƿ���ڣ���������򲻴��������򴴽��ļ�
	 */
	public static void createFileCheck(final String filePath,final String fileName){
		//ʵ�����ļ�����ʵ��
		File file = new File(filePath+fileName);
		//�ж��ļ��ǲ����Ѿ�����
		if(!file.exists()){
			//ִ���ļ���������
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("�ļ�����ʧ�ܣ�");
				e.printStackTrace();
			}
		}else{
			System.out.println("�ļ��Ѿ�����,�������ظ�������");
		}
		//����ͨ��
	}
	
	/**
	 * �ж��ļ����Ƿ���ڣ����粻���ھʹ����ļ���
	 * @param filePath
	 * @param fileName
	 */
	public static void creteFolder(final String filePath,final String fileName){
		//����һ���ļ�����ʵ��
		File file = new File(filePath+fileName);
		if(!file.exists()){
			//�����ļ���
			file.mkdir();
			System.out.println("�ļ��д����ɹ���");
		}else{
			System.out.println("�ļ����Ѿ����ڣ�");
		}
	}
}
