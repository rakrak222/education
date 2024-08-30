package com.newlecture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.newlecture.web.entity.Exam;



public class App2 {

	
	public static void main(String[] args) {
		
		{
			//Map map = new HashMap();
			Map<String,Object> map = new HashMap<>();
			map.put("id", 111);
			map.put("name", "백창락");
			map.put("전화번호", "111-1111");
			
			for(String key : map.keySet())
				System.out.println(key);
				
			for(Object value : map.values())
				System.out.println(value);
			
			for(Map.Entry<String, Object> entry : map.entrySet())
				System.out.printf("key: %s, values: %s\n"
						, entry.getKey()
						, entry.getValue());

		}
		
		
		
		{
			List<Integer> list = new ArrayList<>();
			list.add(3);
			list.add(3);
			list.add(4);
			list.add(3);
			//list.add("sss");
			int num = list.get(0);
			
			System.out.println(list.get(1));
			System.out.println(list.size());
		}
		
		
		{
//			Object obj = new Exam();
//			Object obj1 = 3;
//			int num = obj1;
			
			
			Exam exam = new Exam("hong",1,1,1);
			Exam exam1 = new Exam("ha",2,2,2);
			Set<Exam> set1 = new HashSet();
			
		
			
			set1.add(exam);
			set1.add(exam);
			set1.add(exam);
			set1.add(exam);
			set1.add(exam1);
			
			set1.add(new Exam("y",1,1,1));
			set1.add(new Exam("y1",3,3,3));
			
			int size = set1.size();
			System.out.println(size);
			
			
			
			System.out.println(set1.iterator().next()); 
			System.out.println(set1.iterator().next()); //위 코드와 별개의 이터레이터
			{
				Iterator it1 = set1.iterator();
				
				while(it1.hasNext())
					System.out.println(it1.next());
			}
			{
				//foreach 문
				for(Exam exa : set1)
					System.out.println(exa);
			}
			
			
			Set set = new HashSet();
			set.add(3);
			set.add(3);
			set.add(4);
			set.add(3);
			System.out.println(set.add(2));
			System.out.println(set.size());
			boolean hasNum = set.contains(3);
			System.out.println(hasNum);
			
			
		}
		
	}
}
