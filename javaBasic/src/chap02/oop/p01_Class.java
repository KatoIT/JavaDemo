package chap02.oop;


public class p01_Class {

	public static void main(String[] args) {
		System.out.println("Hello World");

		Student studentOne = new Student(0, null, null);
		Student studentTwo = new Student(0, null, null);


		studentOne.setName("An");
		studentOne.setDate(2000);
		studentOne.setSex("Men");
		studentOne.setLop("CNTT1");
		studentTwo.setName("Khang");
		studentTwo.setDate(2007);
		studentTwo.setSex("Men");
		studentTwo.setLop("7B");
		
		studentOne.showInfo();
		studentTwo.showInfo();
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
		
	}
}
