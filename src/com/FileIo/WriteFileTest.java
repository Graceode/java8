package com.FileIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String path = "D:/workspaceEclipse/newMyfile.txt";
			//��ǰ����һ���ַ������ڴ�Ŵ�д���ļ���·��
			String content = "shiyanlou";
			//����һ���ַ�����Ŵ�д�������
			FileOutputStream file = new FileOutputStream(path);
			//����һ���ļ���������󣬲�ָ��·��
			file.write(content.getBytes());
			//ͨ��write()����������д���ļ���
			//ͨ��getBytes()�������ַ���ת��Ϊ������
			file.close();//�ǵùر��ļ�
			System.out.println("File created successfully.");
			
			//��ʾ�û������ɹ�
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
