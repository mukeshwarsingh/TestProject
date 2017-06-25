package org.mukesh.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton{

	private static Singleton instance = null;
	private Singleton(){
		
		if(instance != null){
			
			throw new RuntimeException("Can't create, please use getInstance method");
		}
		System.out.println("Creating Singleton Object...");
	}
		
	public static Singleton getInstance(){			
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}

class TestClass{

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		
		System.out.println("Creating object using Reflection: ");
		
		/*Class clazz = Class.forName("org.mukesh.test.Singleton");
		Constructor<Singleton> contr = clazz.getDeclaredConstructor();
		contr.setAccessible(true);
		
		Singleton singleton = contr.newInstance();
		
		print("singleton", singleton);*/
		
		System.out.println("Creating Singleton Object: ");
		Singleton s1 = Singleton.getInstance();		
		Singleton s2 = Singleton.getInstance();
		
		print("s1", s1);
		print("s2", s2);				
		
		/*ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(TestClass :: useSingleton);
		service.submit(TestClass :: useSingleton);
		
		service.shutdown();*/
	}	
	static void useSingleton(){
		
		Singleton s1 = Singleton.getInstance();
		print("singleton", s1);
	}
	
	static void print(String s, Singleton object){
		
		System.out.println(String.format(" Object : %s,  Hashcode : %d", s, object.hashCode()));
	}
	
}
