package com.FileIo;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			//FileInputStream file = new FileInputStream("D:/workspaceEclipse/Myfile.txt");
			//BufferedInputStream file = new BufferedInputStream(new FileInputStream("D:/workspaceEclipse/Myfile.txt"));
			//FileReader file = new FileReader("D:/workspaceEclipse/Myfile.txt");
			BufferedReader file = new BufferedReader(new FileReader("D:/workspaceEclipse/Myfile.txt"));
			//����һ�������������file,��ָ���ļ���ϵͳ�е�·���Է��㶨λ
			int data = 0;
			//����һ�����ͱ������ڴ�Ŷ�ȡ������
			while ((data = file.read()) !=-1){
				//��whileѭ����ʹ��read()����������ȡfile�����ݸ���data��
                //�����ȡʧ�ܻ��߽������򽫷���-1���������ķ���ֵ������Ϊ��ȡ�����ı�ʶ
				//System.out.println(file.readLine());BufferedReader��һ������readLine()�����ڶ����ļ�ĩβʱ����null��
				System.out.println((char)data);//�ַ���ʱ����Ҫ��char,�ֽڲ���Ҫ
			}
			file.close();
			//�ļ���ȡ������һ��Ҫͨ��close���������ر����������
		}catch(FileNotFoundException e){
			//����ļ�δ�ҵ����򲶻���쳣
            e.printStackTrace();			
		}catch(IOException e){
			//�������������������򲶻��쳣
			e.printStackTrace();
			
		}
	}

}
