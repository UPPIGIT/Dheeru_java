package com.semanticsquare.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {
	
	public static void main(String[] args) throws FileNotFoundException {	
		System.out.println("\nInside main ...");		
		//try {
			share();
		/*} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	*/				
		System.out.println("\nEnd of main ...");
	}

	private static void share() throws FileNotFoundException {
		System.out.println("\nInside share ...");
		
		try {
			HttpConnect.send(0, "hello", "http://www.goodsnips.com");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Connecting to a different server ...");
		} catch (Exception e) {}
		catch (Throwable e) {}
		
		System.out.println("\nEnd of share ...");
	}	
	 
}
