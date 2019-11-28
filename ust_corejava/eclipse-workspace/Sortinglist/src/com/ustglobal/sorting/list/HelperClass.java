package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HelperClass {

	void displayAllStudentDetails(ArrayList<Student> al) {


		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student st =  it.next();
			System.out.println(st);

		}
	}

	void displayFilledStudents(ArrayList<Student> as){


		List<Student> sts =

		  as.stream().filter(student -> student.per < 40  ).collect(Collectors.toList());

		Iterator<Student> it = sts.iterator();

		while (it.hasNext()) {
			Student sd =  it.next();

			System.out.println(sd);

		}
	}

	void displayPassedStudents(ArrayList<Student> as){


		List<Student> sts1 =

		as.stream().filter(student -> student.per >  40  ).collect(Collectors.toList());

		Iterator<Student> it = sts1.iterator();

		while (it.hasNext()) {
			Student sp =  it.next();

			System.out.println(sp);

		}

	}
	void displayToperStudents(ArrayList<Student> as){

		Comparator<Student> cmp = (s1 , s2) -> {

			if(s1.per > s2.per)
				return 1;
			
			if(s1.per < s2.per)
				return -1 ;

			return 0;

		};

		Student tp = as.stream().max(cmp).get();
		System.out.println(tp);



	}

}
