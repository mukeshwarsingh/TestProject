package org.mukesh.test;

public class Triangle extends Shape{

	int j = 20;
	//int j = 20;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void design(){
		System.out.println("Design class of Trigangle");		
	}
	
	public void demo(){
		System.out.println("Sample demo function of Triganle class");
		
	}
}
