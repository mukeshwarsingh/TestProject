package org.mukesh.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain {
	
	public static void printList( List<Person> personList){
		
		System.out.println(personList.toString());
	}
	
	public static void printLastNamebeginswithC( List<Person> personList){
		
		for(Person person : personList){
			
			if(person.getLastname().charAt(0) == 'C'){
				
				System.out.println(person);
			}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println("Inside main method of TestMain class");
		
		System.out.println("develop branch of TestMain project");
		
		String message = ApplicationResponseCode.STATUS_OK.getMessageKey();
		System.out.println("Message: "+ message);
		
		
		/*
		
		List<Person> personList = Arrays.asList(				
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)					
				);
		
		// Sort list by last name
		// Create a method that prints all elements in the list
		// Create a method that prints all people that have last name beginning with C
		
		Collections.sort(personList, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getLastname().compareTo(o2.getLastname());				
			}			
		});			
		
		Comparator<Person> comparator = (Person o1, Person o2) -> { 
			return o1.getLastname().compareTo(o2.getLastname()) ;
		};
		
		Collections.sort(personList, (Person o1, Person o2) -> o1.getLastname().compareTo(o2.getLastname()));
		
		printLastNamebeginswithC(personList);
		System.out.println(personList);
		
		
		// TODO Auto-generated method stub
		
		Triangle triangle = new Triangle();
		
		try {
			FileOutputStream fout = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(triangle);
			
			FileInputStream fin = new FileInputStream("abc.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Triangle tri = (Triangle)oin.readObject();
			
			System.out.println("Trianlge i value:"+ tri.getI() + " j value: "+ tri.j);			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	*/}

}
