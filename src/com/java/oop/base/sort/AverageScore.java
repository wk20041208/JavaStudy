package com.java.oop.base.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//定义一个Student类，属性:name 姓名 classNumber 班号，score 成绩
//现将若干Student对象放入List,统计出每个班级的总分和平均分并打印
public class AverageScore {

	
	
	
	public static void exam(List<Student> list) {
		list.add(new Student("zhangsan","001",70));
		list.add(new Student("lisi","003",92));
		list.add(new Student("zhaoliu","008",80));
		list.add(new Student("liubei","003",75));
		list.add(new Student("caochao","001",78));
		list.add(new Student("lvbu","002",85));
		list.add(new Student("guanyu","008",65));
		list.add(new Student("zhangliao","003",91));
	}
	
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Map<String,ClassRoom> rooms = new HashMap<>();
		exam(list);
		count(rooms, list);
		print(rooms);
		
		
	}
	
	public static void count(Map<String,ClassRoom> rooms,List<Student> list) {
		for(Student stu:list) {
			String no = stu.getNo();
			double score = stu.getScore();
			ClassRoom crs  = rooms.get(no);
			if(null == crs) {
				crs = new ClassRoom(no);
			}
			crs.setTota(crs.getTota() + score);
			crs.getStus().add(stu);
			rooms.put(no, crs);
		}
	}
	
	public static void print(Map<String,ClassRoom> rooms) {
		Set<Map.Entry<String,ClassRoom>> set = rooms.entrySet();
		Iterator<Entry<String,ClassRoom>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String,ClassRoom> room = it.next();
			ClassRoom cr = room.getValue();
			
			double average = cr.getTota() /cr.getStus().size();
			System.out.println("班号:"+ cr.getNo() + "总分:" +cr.getTota() + "平均分:" + average );
		}
	}

}
