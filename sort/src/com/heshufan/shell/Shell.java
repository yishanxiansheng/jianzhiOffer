package com.heshufan.shell;

/*
 * 
 * 
 * 
 * 
 * 
 */
public class Shell {

	public static void main(String[] args) {
		try {
			System.out.println("hello world");
			throw new RuntimeException();
		} catch(RuntimeException exception){
			System.out.println("error");
		}
		finally {
			System.out.println("finally excuting");
		}
		
	}

}
