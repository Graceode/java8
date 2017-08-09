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
			//声明一个问题件输入流file,并指明文件该系统中的路径以方便定位
			int data = 0;
			//声明一个整型变量用于存放读取的数据
			while ((data = file.read()) !=-1){
				//在while循环中使用read()方法持续读取file，数据赋到data中
                //如果读取失败或者结束，则将返回-1，这个特殊的返回值可以作为读取结束的标识
				//System.out.println(file.readLine());BufferedReader有一个方法readLine()，它在读到文件末尾时返回null。
				System.out.println((char)data);//字符的时候需要加char,字节不需要
			}
			file.close();
			//文件读取结束后一定要通过close（）方法关闭这个流对象
		}catch(FileNotFoundException e){
			//如果文件未找到，则捕获该异常
            e.printStackTrace();			
		}catch(IOException e){
			//如果输入输出发生错误，则捕获异常
			e.printStackTrace();
			
		}
	}

}
