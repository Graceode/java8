package com.FileIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String path = "D:/workspaceEclipse/newMyfile.txt";
			//提前声明一个字符串用于存放待写入文件的路径
			String content = "shiyanlou";
			//声明一个字符串存放待写入的内容
			FileOutputStream file = new FileOutputStream(path);
			//声明一个文件输出流对象，并指定路径
			file.write(content.getBytes());
			//通过write()方法将数据写入文件中
			//通过getBytes()方法将字符串转化为二进制
			file.close();//记得关闭文件
			System.out.println("File created successfully.");
			
			//提示用户创建成功
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
