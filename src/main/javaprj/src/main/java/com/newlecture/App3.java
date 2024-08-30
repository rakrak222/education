package com.newlecture;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.newlecture.web.entity.Exam;

public class App3 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		
		//객체 생성
		
		{
			Exam exam = new Exam();
			exam.setName("newlec");
			exam.setKor(10);
			exam.setEng(20);
			exam.setMath(10);
			
			//정적메소드
			String csv = CSVParser.toCSV(exam);
			//CSVParser.("res/");
			
			System.out.println(csv);
		}
		
		{
			
//			Class clz = Exam.Class;
//			Class clz2 = new Exam.getClass();
//			Class clz3 = Class
					
					
					
			String className = "com.newlecture.web.entity.Exam";
			String callMethodName = "setName";
			String value = "newlec";
			String value2 = "newlc";
//			Exam exam = new Exam();
			
			Object object = (Exam) Class.forName(className).getDeclaredConstructor().newInstance();
			
			
			
			//RTTI -> RunhTypeInformation
			//클래스를 위한 클래스
			Class clazz = object.getClass();
			Class clazz2 = Exam.class;
			
			Method[] methods = clazz.getDeclaredMethods();
			
			for(Method m : methods) {
				System.out.println(m.getName());
				if(m.getName().equals(callMethodName))
					m.invoke(object, value);
			}
			System.out.println(object);
			
			for(Method m : methods) {
				System.out.println(m.getName());
				if(m.getName().equals(callMethodName))
					m.invoke(object, value2);
			}
			//exam.setKor(30);
			System.out.println(object);
			
		}
	}
}
