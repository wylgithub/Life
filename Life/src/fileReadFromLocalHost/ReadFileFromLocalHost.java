package fileReadFromLocalHost;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileFromLocalHost {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
//		String Url = "D:/readfile.txt";
//
//		try {
//			//E:/Java/fileReadTest/readfile.txt"
//			FileInputStream file = new FileInputStream(Url);
//			//���ַ�������ת�����ֽ������������ϻ���������
//			BufferedReader buf = new BufferedReader(new InputStreamReader(file));
//			String str = null;
//			int i = 1;
//			while((str = buf.readLine()) != null){
//				System.out.println("��"+i+"��:"+str);
//				i++;
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("�ļ���ȡ�쳣�����飡");
//			e.printStackTrace();
//		}
//		
//	}
//	String path = "E:/Java/fileReadTest/readfile.txt";
	JavaFileOperation file =new JavaFileOperation();
//	file.ReadFileFromLocalHost(path);
	
	//����һ���ļ�,test.txt
	String filePath = "E:/Java/fileReadTest/";
	String fileName = "test.txt";
	String fullFilePath = "E:/Java/fileReadTest/test.txt";
	//�����ļ�
	//file.createFileToLocalHost(filePath, fileName);
	//���ļ���д������
//	file.WriteFileToLocalHost(fullFilePath);
//	file.createFileCheck(filePath, fileName);
	file.creteFolder(filePath, "helloWorld");
	}
}
