/*
 * Create a Person class with private instance variables for the person's name and
 * birth date. Add appropriate accessor methods for these variables. Then create a
 * subclass CollegeGraduate with private instance variables for the student's GPA
 * and year of graduation and appropriate accessors for these variables. Don't 
 * forget to include appropriate constructors for your classes. Then create a class
 * with a main() method that demonstrates your classes.
 */
class Person {
	private String name;
	private String birthDate;
	
	Person() {
		name = null;
		birthDate = null;
	}
	
	Person(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	String getName() {
		return name;
	}
	
	String getBirthDate() {
		return birthDate;
	}
}

class CollegeGraduate extends Person {
	private double GPA;
	private int yearOfGrad;
	
	CollegeGraduate() {
		super();
		GPA = 0.0;
		yearOfGrad = 0;
	}
	
	CollegeGraduate(String name,String birthDate,double GPA,int yearOfGrad) {
		super(name,birthDate);
		this.GPA = GPA;
		this.yearOfGrad = yearOfGrad;
	}
	
	void setGPA(double GPA) {
		this.GPA =GPA;
	}
	
	void setYearOfGrad(int yearOfGrad) {
		this.yearOfGrad = yearOfGrad;
	}
	
	double getGPA() {
		return GPA;
	}
	
	int getYearOfGrad() {
		return yearOfGrad;
	}
}

class CollegeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeGraduate p1 = new CollegeGraduate("ABC", "15/4/1988", 8, 2011);
		System.out.println("College Grad's details : ");
		System.out.println("Name : " + p1.getName());
		System.out.println("BirthDate : " + p1.getBirthDate());
		System.out.println("GPA : " + p1.getGPA());
		System.out.println("Year of Graduation : " + p1.getYearOfGrad());
	}

}
