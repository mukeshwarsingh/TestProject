package org.mukesh.test;

import java.io.Serializable;

public class Shape implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int i = 10;
	public void design(){
		
		System.out.println("Design class of Shape");
		
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}

}
