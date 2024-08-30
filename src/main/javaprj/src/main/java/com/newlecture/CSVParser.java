package com.newlecture;

import java.beans.Transient;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.newlecture.annotations.Precision;

public class CSVParser {

	//public static String toCSV(Exam exam) throws IllegalAccessException, InvocationTargetException {
	public static <T> String toCSV(T entity) throws IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder();
		
		// 리플렉션을 사용해서 ~에 있는 getter 함수 뽑아내기
		
//		Class clazz = exam.getClass();
		Class clazz = entity.getClass();
		
		{
			Field[] fields = clazz.getDeclaredFields();
			
			for(Field f : fields) {
				if(f.isAnnotationPresent(Transient.class)) {
					
					f.setAccessible(true);
					Object value = f.get(entity);
					
					builder.append(value);
					builder.append(" ");
				}
			}
			
			
			
		}
		
		{
			//clazz.getMethods(); , clazz.getDeclaredMethods(); 차이
			
			Method[] methods = clazz.getDeclaredMethods();
	
			for(Method m : methods) {
				
				if(m.getName().startsWith("get")) 
					
					
					
					
					//if(m.getAnnotation(Transient.class) == null) {
					if(!m.isAnnotationPresent(Transient.class)) {
						
						Object value = m.invoke(entity, null);
						
						if(m.isAnnotationPresent(Precision.class)) {
						    Precision precision = m.getAnnotation(Precision.class);
						    int v = precision.num();
						    value = String.format("%." + v + "f", value);
						}
						builder.append(value);
						builder.append(" ");
				}
			}
		}
		
		return builder.toString();
	}

}
