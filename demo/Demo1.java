public class Demo1{
	public static void main(String[] args){
		//System.out.println("hello world!!!");
		//Cat c = new Cat();
		//c.name = "small black cat";
		//c.setName("small black cat");
		//c.printName();
		Dog d = new Dog();
		Sheep s = new Sheep();
		Pig p = new Pig();
		
		d.printName();
		d.bark();
		
		s.printName();
		s.bark();
		
		p.printName();
		p.bark();
	}
}

class Cat extends Animal{
	//private String name = "small cat";
	void printName(){
		System.out.println(this.name);
	}
	
	void setName(String name){
		this.name = name;
	} 
}

class Dog implements Animaler{
	public void printName(){
		System.out.println("I'm dog!!!");
	}
	public void bark(){
		System.out.println("wangwang");
	}
	public void printColor(){
		System.out.println("black!!");
	}
}

class Sheep implements Animaler{
	public void printName(){
		System.out.println("I'm Sheep!!!");
	}
	
	public void bark(){
		System.out.println("miemie");
	}
}

class Pig implements Animaler{
	public void printName(){
		System.out.println("I'm Pig!!!");
	}
	public void bark(){
		System.out.println("hengheng");
	}
}

interface Animaler{
	void printName();
	void bark();
	void printColor();
}

class Animal{
	String name;
}