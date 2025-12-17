package OOP;

//Encapsulation

class Inheritance {
	private String name="Hari";
	private int age=22;
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	
	void setName(String name) {
		this.name=name;	
		}
	void setAge(int age) {
		this.age=age;
	}
	
}
//inheritance
class Child extends Inheritance{
	String name;
	int age;
	void setName(String name) {
		this.name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
	
}
//abstraction
abstract class a{
	abstract void display();
}
//interface
interface i{
	void display();
}
public class Oop{
	public static void main(String []args) {
		Child ch=new Child();
		Inheritance ih=new Inheritance();
		String name=ih.getName();
		int age=ih.getAge();
		ch.setName(name);
		ch.setAge(age);
		System.out.println("Name is : "+ch.getName());
		System.out.println("Age is : "+ch.getAge());
	}
}
