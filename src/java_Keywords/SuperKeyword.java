package java_Keywords;

public class SuperKeyword extends Animal {
	
	
	/*
	 * Super keyword in java is a reference variable that is used to refer immediate parent class objects.
	 * 1. It is used to refer immediate parent class variables.
	 * 2. It is used to refer immediate parent class methods.
	 * 3. it is used to refer immediate parent class constructors.
	 */
	

	String color = "black from SuperKeyword class"; 
	
	void printColor(){  
		System.out.println(color);   //prints color of SuperKeyword class  
		System.out.println(super.color); //prints color of Animal class. refer to the variable of the parent class.
	} 
	
	void eat(){
		System.out.println("eating bread...");
	}  
	
	void bark(){
		System.out.println("barking...");
	}  
	
	void work(){  
		super.eat();  // it will refer to eat method from immediate parent class
		bark();  
	} 
	
	
	SuperKeyword(){
		super();   //it will refer to immediate parent class constructor
		System.out.println("superKeyword is created");
	}

	public static void main(String[] args) {
		
		SuperKeyword sk = new SuperKeyword(); 
		sk.printColor();
		sk.work();
	}

}
