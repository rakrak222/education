package com.newlecture.web.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.newlecture.web.entity.Exam;


@Component
public class FileExamRepository implements Repository<Exam> {

	public List<Exam> findAll() throws IOException {
		
		List<Exam> list = new ArrayList<>();
		
		FileInputStream fis = new FileInputStream("/C:/8th_rak/Work/WebApp2/res/data.csv");
		Scanner scan = new Scanner(fis);

		for (int i = 0; scan.hasNextLine() && i < 6; i++) {
			String name;
			int kor, eng, math;

			String line = scan.nextLine();
			String[] tokens = line.split(",");

			name = tokens[0];

			if (isNumeric(tokens[1]))
				kor = Integer.parseInt(tokens[1]);
			else
				kor = 0;

			if (!(0 <= kor && kor <= 100))
				kor = 0;

			if (!isNumeric(tokens[2]))
				eng = 0;
			else
				eng = Integer.parseInt(tokens[2]);
			if (!(0 <= eng && eng <= 100))
				eng = 0;

			if (!isNumeric(tokens[3]))
				math = 0;
			else
				math = Integer.parseInt(tokens[3]);

			// eng 값의 유효성 검사
			if (!(0 <= math && math <= 100))
				math = 0;


			list.add(new Exam(name, kor, eng, math));

		}
		
		
		scan.close();
		fis.close();

		return list;
	}
	
	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
		
	}





	@Override
	public int save(Exam exam) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Exam exam) {
		// TODO Auto-generated method stub
		return 0;
	}

}
