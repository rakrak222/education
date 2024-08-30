package com.newlecture.di;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.newlecture.web.entity.Exam;
import com.newlecture.web.repository.Repository;
import com.newlecture.web.service.ExamService;

public class App2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ApplicationContext context = new 
				AnnotationConfigApplicationContext("com.newlecture.web");
		
		
		ExamService service = context.getBean(ExamService.class);
		
		List<Exam> list = service.getList();
		System.out.println(list);
		
		
		/*
		Repository<Exam> repository = context.getBean(Repository.class);
		
		List<Exam> list = repository.findAll();
		
		System.out.println(list);
		
		String realPath;
		{
			String pack = "com.newlecture.web.repository";
			String path = pack.replace(".", "/");
			System.out.println(path);
			
			ClassLoader classLoader = App2.class.getClassLoader();
			//Class clz = classLoader.loadClass(path);
			
			realPath = classLoader.getResource(path).getFile().toString();
			System.out.println(realPath);
			//realPath = realPath.substring(1,realPath.length());
			System.out.println(realPath);

			/*
			Class 정보 객체를 얻는 방법 4가지
			Exam exam = new Exam();
			exam.getClass();
			Exam.class;
			Class.forName("com.newlecture.web.entity");
			App2.class.getClassLoader().loadClass("");
			 * 
			 
			
		}
		
		
		// 디렉토리 목록 출력
		
		{
			
			//String path = "C:\\8th_rak\\WebWork\\javaprj\\src\\main\\java\\com\\newlecture";
			File directory = new File(realPath);
			File[] files = directory.listFiles();
			
			
			for(File file : files) {
				String type = "f";
				if(file.isDirectory())
					type = "d";
				System.out.printf("%s: %s",type,file.getName());
				
			}
			
		}
		*/
		
	}
	
	
	
}
