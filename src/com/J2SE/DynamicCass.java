package com.J2SE;

import java.io.File;
import java.lang.reflect.Constructor;

public class DynamicCass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Constructor<File> constructor = File.class.getDeclaredConstructor(String.class);
			//获得File类的Constructor对象
			System.out.println("Create File object with reflect");
			//使用反射创建File对象
			File file = constructor.newInstance("D:/workspaceEclipse/space1/J2SE/Myfile.txt");
			System.out.println("use file object tp create Myfile.txtx in Dpan");
			//指定创建的路径为D盘，名称为MYfile.txt
			file.createNewFile();//创建新文件
			System.out.println("File is created?"+file.exists());
			//验证文件是否创建成功
			
			


			
		}catch (Exception e){
			e.printStackTrace();}
		}
}		


