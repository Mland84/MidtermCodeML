package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.Date;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Student> StudentList = new ArrayList<Student>();
		ArrayList<Course> CourseList = new ArrayList<Course>();
		ArrayList<Semester> SemesterList = new ArrayList<Semester>();
		ArrayList<Section> SectionList = new ArrayList<Section>();
		Course c1, c2, c3;
		Semester fall, spring;
		Section s1, s2, s3, s4, s5, s6;
		Student st1, st2, st3, st4, st5, st6, st7, st8, st9, st10;

		c1 = new Course("Orgo", 4, eMajor.Chem);
		CourseList.add(c1);
		c2 = new Course("Residency", 4, eMajor.Nursing);
		CourseList.add(c2);
		c3 = new Course("Optics", 4, eMajor.Physics);
		CourseList.add(c3);
		Date d = new Date(97, 4, 14);	
		st1 = new Student("Mitch", "Stevenson", "Land", d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st1);
		st2 = new Student("Mitch", "Stevenson", "Land", d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st2);
		st3 = new Student("Mitch", "Stevenson", "Land", d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st3);
		st4 = new Student("Mitch", "Stevenson", "Land", d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st4);
		st5 = new Student("Mitch", "Stevenson", "Land", d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st5);
		st6 = new Student("Mitch", "Stevenson", "Land", d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st6);
		st7 = new Student("Mitch", "Stevenson", "Land",d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st7);
		st8 = new Student("Mitch", "Stevenson", "Land", d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st8);
		st9 = new Student("Mitch", "Stevenson", "Land", d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st9);
		st10 = new Student("Mitch", "Stevenson", "Land", d, eMajor.Physics, "16 Christiana dr",
				"123,456,7890", "hi@udel.edu");
		StudentList.add(st10);
		
		//Changing major
		st10.setMajor(eMajor.COMPSI);
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}