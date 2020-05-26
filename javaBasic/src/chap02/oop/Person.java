package chap02.oop;

import java.util.Calendar;

public class Person {

	private int date;
	private String name;
	private String sex;
	public Person(int date, String name, String sex) {
		this.date = date;
		this.name = name;
		this.sex = sex;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR) - this.date;
	}
	public void showInfo() {
		System.out.println("Student: ");
		System.out.println("Name:\t" + this.getName());
		System.out.println("Date:\t" + this.getDate());
		System.out.println("Sex: \t" + this.getSex());
		System.out.println("Age: \t" + this.getAge());
	}
}
