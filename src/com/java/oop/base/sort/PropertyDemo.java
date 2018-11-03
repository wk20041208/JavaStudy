package com.java.oop.base.sort;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//Hashtable

public class PropertyDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.setProperty("driver", "com.mysql.cj.jdbc.Driver");
		pro.setProperty("url", "jdbc:mysql://localhost:3306/wangkun?useSSL=false&serverTimezone=Asia/Shanghai");
		pro.setProperty("username","wangkun");
		pro.setProperty("password","wangkun");
		String url = pro.getProperty("url","null url");
		System.out.println(url);
		pro.store(new FileOutputStream(new File("db.properties")),"mysql���ݿ���������");
		pro.storeToXML(new FileOutputStream(new File("db_config.xml")),"mysql���ݿ���������,xml��ʽ","utf-8");
		//�������ļ��ж�ȡ������
		Properties prot = new Properties();
		prot.load(new FileInputStream(new File("db.properties")));
		String user = prot.getProperty("username","root");
		System.out.println(user);
		
		
	}

}
