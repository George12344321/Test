package practice;

import java.util.ArrayList;

public class Course {
String code;
String name;
ArrayList<Double> grades;


public  Course() {
	
}


public Course(String code, String name, ArrayList<Double> grades) {
	super();
	this.code = code;
	this.name = name;
	this.grades = grades;
}


public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public ArrayList<Double> getGrades() {
	return grades;
}


public void setGrades(ArrayList<Double> grades) {
	this.grades = grades;
}

}
