package com.J2SE;

import java.io.File;
import java.lang.reflect.Constructor;

public class DynamicCass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Constructor<File> constructor = File.class.getDeclaredConstructor(String.class);
			//���File���Constructor����
			System.out.println("Create File object with reflect");
			//ʹ�÷��䴴��File����
			File file = constructor.newInstance("D:/workspaceEclipse/space1/J2SE/Myfile.txt");
			System.out.println("use file object tp create Myfile.txtx in Dpan");
			//ָ��������·��ΪD�̣�����ΪMYfile.txt
			file.createNewFile();//�������ļ�
			System.out.println("File is created?"+file.exists());
			//��֤�ļ��Ƿ񴴽��ɹ�
			
			


			
		}catch (Exception e){
			e.printStackTrace();}
		}
}		


